import { WebPlugin } from '@capacitor/core';
import { v4 as uuidv4 } from 'uuid';

import type {
  AppAuthPlugin,
  AppAuthObj,
} from './definitions';

export class AppAuthWeb extends WebPlugin implements AppAuthPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async verifyAppIntegrity(): Promise<AppAuthObj> {
      return Promise.resolve({
        token: uuidv4(),
        platform: "web",
        auth: true,
        error: ""
      });
  }

}
