package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hw8 {
    public final tw8 a;
    public final uw8 b;
    public final Set c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public hw8(tw8 tw8Var, uw8 uw8Var, Set set, String str, boolean z, boolean z2) {
        str.getClass();
        this.a = tw8Var;
        this.b = uw8Var;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        if (this.f) {
            return false;
        }
        Set setL = n3d.l(this.b.a(), this.c);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setL) {
            if (hashSet.add(eb3.L((TarotSkinIdentify) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() >= 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw8)) {
            return false;
        }
        hw8 hw8Var = (hw8) obj;
        return this.a.equals(hw8Var.a) && this.b.equals(hw8Var.b) && this.c.equals(hw8Var.c) && pa7.t(this.d, hw8Var.d) && this.e == hw8Var.e && this.f == hw8Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ub3.d(ub3.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "MixedDeckAvailability(entitlement=" + this.a + ", pool=" + this.b + ", missing=" + this.c + ", currentFixed=" + this.d + ", storageFull=" + this.e + ", downloading=" + this.f + ")";
    }
}
