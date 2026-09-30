package defpackage;

import tech.chatmind.api.EmotionTheme;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xc4 {
    public final String a;
    public final EmotionTheme b;
    public final String c;
    public final String d;

    public xc4(String str, EmotionTheme emotionTheme, String str2, String str3) {
        str.getClass();
        emotionTheme.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = emotionTheme;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc4)) {
            return false;
        }
        xc4 xc4Var = (xc4) obj;
        return pa7.t(this.a, xc4Var.a) && this.b == xc4Var.b && pa7.t(this.c, xc4Var.c) && pa7.t(this.d, xc4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivinationShareEntity(divinationId=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", summary=");
        return ks0.m(sb, this.c, ", advice=", this.d, ")");
    }
}
