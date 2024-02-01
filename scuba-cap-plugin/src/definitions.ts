export interface ExamplePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  dummy(options: DummyParams): Promise<string>;
}

export interface DummyParams {
	   message: string;
}
