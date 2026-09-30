package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zpd implements Iterator {
    public final /* synthetic */ int a;
    public int b = -1;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ zpd(AbstractMap abstractMap, int i) {
        this.a = i;
        this.e = abstractMap;
    }

    public Iterator a() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                Iterator it = this.d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((spd) abstractMap).c.entrySet().iterator();
                this.d = it2;
                return it2;
            case 1:
                Iterator it3 = this.d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((tpd) abstractMap).c.entrySet().iterator();
                this.d = it4;
                return it4;
            default:
                Iterator it5 = this.d;
                if (it5 != null) {
                    return it5;
                }
                Iterator it6 = ((upd) abstractMap).b.entrySet().iterator();
                this.d = it6;
                return it6;
        }
    }

    public Iterator b() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = ((aog) this.e).c.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                spd spdVar = (spd) abstractMap;
                if (this.b + 1 >= spdVar.b.size()) {
                    return !spdVar.c.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                return this.b + 1 < ((tpd) abstractMap).b.size() || a().hasNext();
            case 2:
                upd updVar = (upd) abstractMap;
                if (this.b + 1 >= updVar.a.size()) {
                    return !updVar.b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                aog aogVar = (aog) abstractMap;
                if (this.b + 1 >= aogVar.b) {
                    return !aogVar.c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                spd spdVar = (spd) abstractMap;
                return i2 < spdVar.b.size() ? (Map.Entry) spdVar.b.get(this.b) : (Map.Entry) a().next();
            case 1:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                tpd tpdVar = (tpd) abstractMap;
                return i3 < tpdVar.b.size() ? (Map.Entry) tpdVar.b.get(this.b) : (Map.Entry) a().next();
            case 2:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                upd updVar = (upd) abstractMap;
                return i4 < updVar.a.size() ? (Map.Entry) updVar.a.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i5 = this.b + 1;
                this.b = i5;
                aog aogVar = (aog) abstractMap;
                return i5 < aogVar.b ? (bog) aogVar.a[i5] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                spd spdVar = (spd) abstractMap;
                if (!this.c) {
                    qc0.p("remove() was called before next()");
                } else {
                    this.c = false;
                    int i2 = spd.g;
                    spdVar.c();
                    if (this.b >= spdVar.b.size()) {
                        a().remove();
                    } else {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        spdVar.h(i3);
                    }
                }
                break;
            case 1:
                tpd tpdVar = (tpd) abstractMap;
                if (!this.c) {
                    qc0.p("remove() was called before next()");
                } else {
                    this.c = false;
                    int i4 = tpd.f;
                    tpdVar.c();
                    if (this.b >= tpdVar.b.size()) {
                        a().remove();
                    } else {
                        int i5 = this.b;
                        this.b = i5 - 1;
                        tpdVar.g(i5);
                    }
                }
                break;
            case 2:
                upd updVar = (upd) abstractMap;
                if (!this.c) {
                    qc0.p("remove() was called before next()");
                } else {
                    this.c = false;
                    int i6 = upd.f;
                    updVar.c();
                    if (this.b >= updVar.a.size()) {
                        a().remove();
                    } else {
                        int i7 = this.b;
                        this.b = i7 - 1;
                        updVar.i(i7);
                    }
                }
                break;
            default:
                if (!this.c) {
                    qc0.p("remove() was called before next()");
                } else {
                    this.c = false;
                    aog aogVar = (aog) abstractMap;
                    aogVar.g();
                    int i8 = this.b;
                    if (i8 >= aogVar.b) {
                        b().remove();
                    } else {
                        this.b = i8 - 1;
                        aogVar.e(i8);
                    }
                }
                break;
        }
    }
}
