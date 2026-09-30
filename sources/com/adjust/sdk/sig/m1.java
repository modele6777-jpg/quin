package com.adjust.sdk.sig;

import defpackage.ub3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends IllegalArgumentException {
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    public m1(String str, String str2) {
        String strConcat;
        StringBuilder sbO = ub3.o(str);
        if (str2 != null) {
            for (int i = 0; i < str2.length(); i++) {
                char cCharAt = str2.charAt(i);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    strConcat = "\n".concat(str2);
                }
            }
            strConcat = "";
        } else {
            strConcat = "";
        }
        sbO.append(strConcat);
        String string = sbO.toString();
        super(string);
        this.a = string;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
