package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mfh extends nfh {
    public static final nfh e;

    static {
        nfh nfhVarA = new mfh(null, new wid(0)).a();
        e = nfhVarA;
        mfh mfhVar = new mfh(nfhVarA, new wid(0));
        boolean z = !mfhVar.c;
        Boolean bool = Boolean.TRUE;
        pa7.I("Can't mutate after handing to trace", z);
        pa7.I("Key already present", !mfhVar.b());
        mfhVar.b.put(nfh.d, bool);
        mfhVar.a();
    }
}
