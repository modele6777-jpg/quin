package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t8a extends z8a {
    public u8a g;

    @Override // defpackage.z8a, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof b1b) {
            return super.containsKey((b1b) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof srf) {
            return super.containsValue((srf) obj);
        }
        return false;
    }

    @Override // defpackage.z8a, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof b1b) {
            return (srf) super.get((b1b) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof b1b) ? obj2 : (srf) super.getOrDefault((b1b) obj, (srf) obj2);
    }

    @Override // defpackage.z8a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final u8a g() {
        p4f p4fVar = this.c;
        u8a u8aVar = this.g;
        if (p4fVar != u8aVar.a) {
            this.b = new jy4(14);
            u8aVar = new u8a(this.c, this.f);
        }
        this.g = u8aVar;
        return u8aVar;
    }

    @Override // defpackage.z8a, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof b1b) {
            return (srf) super.remove((b1b) obj);
        }
        return null;
    }
}
