package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum v2a {
    /* JADX INFO: Fake field, exist only in values array */
    Flex(R.string.pay_duration_flex, R.string.pay_duration_flex_suffix),
    Week(R.string.pay_duration_week, R.string.pay_duration_week_suffix),
    Month(R.string.pay_duration_month, R.string.pay_duration_month_suffix),
    Quarter(R.string.pay_duration_quarter, R.string.pay_duration_quart_suffixer),
    Year(R.string.pay_duration_year, R.string.pay_duration_year_suffix);

    private final int priceSuffixStringId;
    private final int stringId;

    v2a(int i, int i2) {
        this.stringId = i;
        this.priceSuffixStringId = i2;
    }
}
