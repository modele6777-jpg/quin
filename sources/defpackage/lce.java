package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lce implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ lce(int i, String str) {
        this.a = 3;
        this.c = i;
        this.b = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        kce kceVar;
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    x8cVarW0.Q(1, str);
                    x8cVarW0.m(2, i2);
                    int iK = y8c.k(x8cVarW0, "work_spec_id");
                    int iK2 = y8c.k(x8cVarW0, "generation");
                    int iK3 = y8c.k(x8cVarW0, "system_id");
                    if (x8cVarW0.R0()) {
                        kceVar = new kce(x8cVarW0.t0(iK), (int) x8cVarW0.getLong(iK2), (int) x8cVarW0.getLong(iK3));
                        break;
                    } else {
                        kceVar = null;
                    }
                    return kceVar;
                } finally {
                    x8cVarW0.close();
                }
            case 1:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", str, "pathway", "open_notification");
                l1fVar.a(Integer.valueOf(i2), "touchpoint_id");
                return wefVar;
            case 2:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    x8cVarW1.Q(1, str);
                    x8cVarW1.m(2, i2);
                    x8cVarW1.R0();
                    return wefVar;
                } finally {
                    x8cVarW1.close();
                }
            default:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    x8cVarW2.m(1, i2);
                    x8cVarW2.Q(2, str);
                    x8cVarW2.R0();
                    return wefVar;
                } finally {
                    x8cVarW2.close();
                }
        }
    }

    public /* synthetic */ lce(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}
