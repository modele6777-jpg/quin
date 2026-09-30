package defpackage;

import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cm4 {
    public final dm4 a;
    public final String b;
    public final List c;
    public final List d;
    public final Instant e;

    public cm4(dm4 dm4Var, String str, List list, List list2, Instant instant) {
        dm4Var.getClass();
        list.getClass();
        list2.getClass();
        this.a = dm4Var;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = instant;
    }

    public static cm4 a(cm4 cm4Var, List list, Instant instant, int i) {
        dm4 dm4Var = cm4Var.a;
        String str = cm4Var.b;
        if ((i & 4) != 0) {
            list = cm4Var.c;
        }
        List list2 = list;
        List list3 = cm4Var.d;
        if ((i & 16) != 0) {
            instant = cm4Var.e;
        }
        cm4Var.getClass();
        dm4Var.getClass();
        list2.getClass();
        list3.getClass();
        return new cm4(dm4Var, str, list2, list3, instant);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm4)) {
            return false;
        }
        cm4 cm4Var = (cm4) obj;
        return this.a == cm4Var.a && pa7.t(this.b, cm4Var.b) && pa7.t(this.c, cm4Var.c) && pa7.t(this.d, cm4Var.d) && pa7.t(this.e, cm4Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iA = tec.a(tec.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Instant instant = this.e;
        return iA + (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        return "DrawBeforeQuestionContext(origin=" + this.a + ", spreadId=" + this.b + ", patternData=" + this.c + ", cards=" + this.d + ", completedAt=" + this.e + ")";
    }
}
