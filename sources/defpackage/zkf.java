package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zkf implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qmf b;

    public /* synthetic */ zkf(qmf qmfVar, int i) {
        this.a = i;
        this.b = qmfVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        qmf qmfVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (str == null) {
                    str = "eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIn0..kUDqs2cnsyAA_2OZ.3KPySkW5bKIlxRx8lS-mwd8DxU4g7Alak2nHubfflT1lOS3XmARDuqCQX6yjGS5-lCmKIqtPNHkkHC-zZbx8I2vRQvA4w6qYFY2Ao-oAm3GmAMq6_b4tKnFxJZO_v7K-tnT_dTv0maejW5siP152LCSH7haSseaSiW0NFjX_m-zEB13T0mhQbjaxquK951SJTdJvwB7Rj_yRTIWaeMks04vhyinfuPnG4sIgNEi5QwmSmtU4YDsgB1NFe0J4ZvNG0F6B9KiZTd7seS1WjwxsnPutvq5ytq_w8RWpoojcrfd-S2Uugryxmf1k1Ocnhe70deCVpzs3wrrvDjdC_QC47ocyFMqHBHnZlpsTHOdPm5AZJ8AGShebpVu31ABeBcrGq9YKMQ31u-7GqJ6FQ8GQ9noH0gBobOPIZnHwsozhCN5WH-GcfdBqQE85bV2sa48UcVAoCXwtgD6IR_avfORP7XseH1_EqH4BSxjkiqeuxmaR-Hu0YMqHsso.moWMGxQUmLNM4R-obYrCRA";
                }
                ynb.V(hwf.a(qmfVar), null, null, new slf(null, qmfVar, str, zBooleanValue), 3);
                break;
            default:
                Throwable th = (Throwable) obj2;
                str.getClass();
                th.getClass();
                qmfVar.d().c(str, th);
                break;
        }
        return wefVar;
    }
}
