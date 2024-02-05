export interface AppAuthPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  verifyAppIntegrity(): Promise<AppAuthObj>;
}

export interface AppAuthObj {
	  token: string, 
    auth: boolean, 
    platform: string,
    error: string
}
