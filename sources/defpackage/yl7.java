package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl7 implements pq7 {
    public static final qq7 c = new qq7(job.a.b(yl7.class));
    public boolean a;
    public final ArrayList b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yl7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yl7 yl7Var = (yl7) obj;
        return this.a == yl7Var.a && this.b.equals(yl7Var.b);
    }

    @Override // defpackage.pq7
    public final qq7 getType() {
        return c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
