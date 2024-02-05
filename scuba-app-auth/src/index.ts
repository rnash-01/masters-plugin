import { registerPlugin } from '@capacitor/core';

import type { AppAuthPlugin } from './definitions';

const AppAuth = registerPlugin<AppAuthPlugin>('AppAuth', {
  web: () => import('./web').then(m => new m.AppAuthWeb()),
});

export * from './definitions';
export { AppAuth };
