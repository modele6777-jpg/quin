package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oyc implements nyc, x81 {
    public final nyc a;
    public final String b;
    public final Set c;

    public oyc(nyc nycVar) {
        nycVar.getClass();
        this.a = nycVar;
        this.b = nycVar.a() + '?';
        this.c = hkg.Y(nycVar);
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.b;
    }

    @Override // defpackage.x81
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.nyc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.nyc
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oyc) {
            return pa7.t(this.a, ((oyc) obj).a);
        }
        return false;
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.nyc
    public final iec g() {
        return this.a.g();
    }

    @Override // defpackage.nyc
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.nyc
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
