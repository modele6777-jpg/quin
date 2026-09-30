package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fog implements vqg {
    public final vqg a;
    public final String b;

    public fog(String str) {
        this.a = vqg.v0;
        this.b = str;
    }

    @Override // defpackage.vqg
    public final Boolean a() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.vqg
    public final Iterator c() {
        return null;
    }

    @Override // defpackage.vqg
    public final String d() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fog)) {
            return false;
        }
        fog fogVar = (fog) obj;
        return this.b.equals(fogVar.b) && this.a.equals(fogVar.a);
    }

    @Override // defpackage.vqg
    public final vqg g(String str, kxa kxaVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.vqg
    public final Double j() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.vqg
    public final vqg m() {
        return new fog(this.b, this.a.m());
    }

    public fog(String str, vqg vqgVar) {
        this.a = vqgVar;
        this.b = str;
    }
}
