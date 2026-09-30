package defpackage;

import ai.askquin.ui.settings.model.UsageCount;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jb implements lb {
    public final UsageCount a;
    public final int b;
    public final int c;

    static {
        kif kifVar = UsageCount.Companion;
    }

    public jb(UsageCount usageCount, int i, int i2) {
        this.a = usageCount;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return this.a.equals(jbVar.a) && this.b == jbVar.b && this.c == jbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreeCount(count=");
        sb.append(this.a);
        sb.append(", remainingCount=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return tec.g(this.c, ")", sb);
    }
}
