# scuba-app-auth2

Provides an API for verifying integrity of the app

## Install

```bash
npm install scuba-app-auth2
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`verifyAppIntegrity()`](#verifyappintegrity)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### verifyAppIntegrity()

```typescript
verifyAppIntegrity() => Promise<AppAuthObj>
```

**Returns:** <code>Promise&lt;<a href="#appauthobj">AppAuthObj</a>&gt;</code>

--------------------


### Interfaces


#### AppAuthObj

| Prop           | Type                 |
| -------------- | -------------------- |
| **`token`**    | <code>string</code>  |
| **`auth`**     | <code>boolean</code> |
| **`platform`** | <code>string</code>  |
| **`error`**    | <code>string</code>  |

</docgen-api>
