import { WebPlugin } from '@capacitor/core';

import type { PyFacePlugin } from './definitions';

export class PyFaceWeb extends WebPlugin implements PyFacePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async loadBuhlmann(options: { fPath: string} ): Promise<void> {
		return;
  }
}
