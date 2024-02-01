export interface ExamplePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  dummy(options: DummyParams): Promise<string>;
  verifyAppIntegrity(): Promise<{token: string, auth: boolean}>;
}

export interface DummyParams {
	   message: string;
}
