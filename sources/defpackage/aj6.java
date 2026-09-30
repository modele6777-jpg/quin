package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aj6 {
    public final String a = "next_step";
    public final String b = "onboarding_source_select";
    public final ArrayList c;

    public aj6(ArrayList arrayList) {
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj6)) {
            return false;
        }
        aj6 aj6Var = (aj6) obj;
        return this.a.equals(aj6Var.a) && this.b.equals(aj6Var.b) && this.c.equals(aj6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("HearFromSubmissionEvent(btn=", this.a, ", pathway=", this.b, ", choice=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
