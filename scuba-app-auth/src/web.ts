import { WebPlugin } from '@capacitor/core';
import { v4 as uuidv4 } from 'uuid';

import type {
  AppAuthPlugin,
	   DummyParams,
} from './definitions';

export class AppAuthWeb extends WebPlugin implements AppAuthPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async verifyAppIntegrity(): Promise<{ token: string; auth: boolean; }> {
      return Promise.resolve({
        token: uuidv4(),
        auth: true
      });
  }

  async dummy(options: DummyParams): Promise<string> {
  		return options.message;
  }
}
