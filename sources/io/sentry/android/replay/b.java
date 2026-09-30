package io.sentry.android.replay;

import defpackage.a26;
import defpackage.gu7;
import defpackage.um8;
import defpackage.v4e;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends gu7 implements a26 {
    public static final b b;
    public static final b c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new b(i, 0);
        c = new b(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                um8 um8Var = (um8) obj;
                um8Var.getClass();
                String strGroup = um8Var.a.group();
                strGroup.getClass();
                String upperCase = String.valueOf(v4e.R(strGroup)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
