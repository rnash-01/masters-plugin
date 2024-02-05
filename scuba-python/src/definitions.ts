export interface PyFacePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  loadBuhlmann(options: { fPath: string }): Promise<{message: string}>;
}
