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
    ETH:CryptoDetail,
    BTC:CryptoDetail,
    LTC:CryptoDetail,
    XRP:CryptoDetail,
    OMG:CryptoDetail,
    REQ:CryptoDetail,
    ZRX:CryptoDetail,
    GNT:CryptoDetail,
    BAT:CryptoDetail,
    AE:CryptoDetail,
    TRX:CryptoDetail,
    XLM:CryptoDetail,
    NEO:CryptoDetail,
    GAS:CryptoDetail

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