import { WebPlugin } from '@capacitor/core';

import type {
	   ExamplePlugin,
	   DummyParams,
} from './definitions';

export class ExampleWeb extends WebPlugin implements ExamplePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async dummy(options: DummyParams): Promise<string> {
  		return options.message;
  }
}
