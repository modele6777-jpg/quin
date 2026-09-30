package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k8e implements zw6 {
    public final bv6 a;
    public final sw6 b;
    public final zb3 c;
    public final gr8 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public k8e(bv6 bv6Var, sw6 sw6Var, zb3 zb3Var, gr8 gr8Var, String str, boolean z, boolean z2) {
        this.a = bv6Var;
        this.b = sw6Var;
        this.c = zb3Var;
        this.d = gr8Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8e)) {
            return false;
        }
        k8e k8eVar = (k8e) obj;
        return pa7.t(this.a, k8eVar.a) && pa7.t(this.b, k8eVar.b) && this.c == k8eVar.c && pa7.t(this.d, k8eVar.d) && pa7.t(this.e, k8eVar.e) && this.f == k8eVar.f && this.g == k8eVar.g;
    }

    @Override // defpackage.zw6
    public final sw6 h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        gr8 gr8Var = this.d;
        int iHashCode2 = (iHashCode + (gr8Var == null ? 0 : gr8Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + ub3.d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // defpackage.zw6
    public final bv6 r() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return ub3.m(sb, this.g, ")");
    }
}
