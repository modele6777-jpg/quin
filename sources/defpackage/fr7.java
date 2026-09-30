package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fr7 {
    public final Integer a;
    public final Set b;
    public final yv6 c;

    public fr7(Set set, yv6 yv6Var) {
        set.getClass();
        this.a = 5;
        this.b = set;
        this.c = yv6Var;
    }

    public final boolean equals(Object obj) {
        return obj instanceof fr7;
    }

    public final int hashCode() {
        return Long.hashCode(398591036L);
    }

    public final String toString() {
        Integer num = this.a;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
