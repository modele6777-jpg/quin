package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rj7 extends q79 {
    public static final rj7 a = new rj7(sj7.class, "jvmFlags", "getJvmFlags(Lkotlin/metadata/KmProperty;)I", 1);

    @Override // defpackage.q79, defpackage.un7
    public final Object get(Object obj) {
        wn7[] wn7VarArr = sj7.a;
        return Integer.valueOf(cn1.D((uq7) obj).a);
    }

    @Override // defpackage.q79, defpackage.hn7
    public final void v(Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        wn7[] wn7VarArr = sj7.a;
        cn1.D((uq7) obj).a = iIntValue;
    }
}
