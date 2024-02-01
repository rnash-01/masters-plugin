# scuba-cap-plugin

Implements necessary interfaces with iOS and Android operating systems, including Python support

## Install

```bash
npm install scuba-cap-plugin
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`dummy(...)`](#dummy)
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


### dummy(...)

```typescript
dummy(options: DummyParams) => Promise<string>
```

| Param         | Type                                                |
| ------------- | --------------------------------------------------- |
| **`options`** | <code><a href="#dummyparams">DummyParams</a></code> |

**Returns:** <code>Promise&lt;string&gt;</code>

--------------------


### verifyAppIntegrity()

```typescript
verifyAppIntegrity() => Promise<{ token: string; auth: boolean; }>
```

**Returns:** <code>Promise&lt;{ token: string; auth: boolean; }&gt;</code>

--------------------


### Interfaces


#### DummyParams

| Prop          | Type                |
| ------------- | ------------------- |
| **`message`** | <code>string</code> |

</docgen-api>
