package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public to0(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            r82.g("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            r82.g("Null videoProfiles");
            throw null;
        }
    }

    public static to0 a(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        return new to0(i, i2, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof to0) {
            to0 to0Var = (to0) obj;
            if (this.a == to0Var.a && this.b == to0Var.b && this.c.equals(to0Var.c) && this.d.equals(to0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return ks0.n(sb, this.d, "}");
    }
}
