package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class of7 extends rd7 {
    public static final /* synthetic */ wn7[] g = {new aya(of7.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final ee8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of7(tmb tmbVar, szc szcVar) {
        super(szcVar, tmbVar, syd.t);
        szcVar.getClass();
        this.f = new ee8(((mf7) szcVar.b).a, new j5(28, this));
    }

    @Override // defpackage.rd7, defpackage.u00
    public final Map g() {
        return (Map) gdc.f(this.f, g[0]);
    }
}
