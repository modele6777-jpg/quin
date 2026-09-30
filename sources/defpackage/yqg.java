package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yqg implements vqg {
    public final String a;
    public final ArrayList b;

    public yqg(String str, ArrayList arrayList) {
        this.a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return null;
    }

    @Override // defpackage.vqg
    public final String d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqg)) {
            return false;
        }
        yqg yqgVar = (yqg) obj;
        String str = yqgVar.a;
        String str2 = this.a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        return this.b.equals(yqgVar.b);
    }

    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.vqg
    public final Double j() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.vqg
    public final vqg m() {
        return this;
    }
}
