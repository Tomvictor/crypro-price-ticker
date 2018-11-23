package com.technorip.com.crypto_price_ticker

class KoinexResponse(
    prices:String,
    stats:CryptoStat
)

class CryptoStat(
    inr:InrStat,
    bitcoin:String,
    ether:String,
    ripple:String
)

class InrStat(
    ETH:String,
    BTC:String,
    LTC:String,
    XRP:String,
    OMG:String,
    REQ:String,
    ZRX:String,
    GNT:String,
    BAT:String,
    AE:String,
    TRX:String,
    XLM:String,
    NEO:String,
    GAS:String

)

class CryptoDetail(
    highest_bid:String,
    lowest_ask:String,
    last_traded_price:String,
    min_24hrs:String,
    max_24hrs:String,
    vol_24hrs:String,
    currency_full_form:String,
    currency_short_form:String,
    per_change:String,
    trade_volume:String

)