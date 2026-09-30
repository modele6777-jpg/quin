package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ use b;

    public /* synthetic */ zr1(use useVar, int i) {
        this.a = i;
        this.b = useVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        use useVar = this.b;
        switch (i) {
            case 0:
                return useVar.d().c.toString();
            case 1:
                return useVar.d().c.toString();
            case 2:
                return useVar.d().c.toString();
            case 3:
                String string = useVar.d().c.toString();
                if (string != null) {
                    v4e.Q(string);
                }
                ynb.V(lw2.a, null, null, new rra(xqa.U.a, string != null ? string : "", null), 3);
                jcc.k(1, "已设置自定义域名，需重启 App 生效");
                return wefVar;
            case 4:
                n3d.g(useVar);
                ynb.V(lw2.a, null, null, new rra(xqa.U.a, "", null), 3);
                jcc.k(1, "已清除自定义域名，需重启 App 生效");
                return wefVar;
            case 5:
                return Boolean.valueOf(!v4e.Q(useVar.d().c));
            case 6:
                return Boolean.valueOf(!v4e.Q(useVar.d().c));
            case 7:
                return useVar.d().c.toString();
            default:
                return useVar.d().c.toString();
        }
    }
}
