import { registerPlugin } from '@capacitor/core';

import type { PyFacePlugin } from './definitions';

const PyFace = registerPlugin<PyFacePlugin>('PyFace', {
  web: () => import('./web').then(m => new m.PyFaceWeb()),
});

export * from './definitions';
export { PyFace };
