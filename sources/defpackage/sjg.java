package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sjg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bwg d;

    public /* synthetic */ sjg(bwg bwgVar, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = bwgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        bwg bwgVar = this.d;
        switch (i) {
            case 0:
                bwgVar.A0();
                oa7.x(str);
                kd0 kd0Var = bwgVar.d;
                if (kd0Var.isEmpty()) {
                    bwgVar.e = j;
                }
                Integer num = (Integer) kd0Var.get(str);
                if (num != null) {
                    kd0Var.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (kd0Var.c < 100) {
                    kd0Var.put(str, 1);
                    bwgVar.c.put(str, Long.valueOf(j));
                } else {
                    w0h w0hVar = ((w3h) bwgVar.b).f;
                    w3h.h(w0hVar);
                    w0hVar.x.a("Too many ads visible");
                }
                break;
            default:
                bwgVar.A0();
                oa7.x(str);
                kd0 kd0Var2 = bwgVar.d;
                Integer num2 = (Integer) kd0Var2.get(str);
                w3h w3hVar = (w3h) bwgVar.b;
                if (num2 == null) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    b9h b9hVar = w3hVar.z;
                    w0h w0hVar3 = w3hVar.f;
                    w3h.g(b9hVar);
                    t8h t8hVarE0 = b9hVar.E0(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        kd0Var2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        kd0Var2.remove(str);
                        kd0 kd0Var3 = bwgVar.c;
                        Long l = (Long) kd0Var3.get(str);
                        if (l == null) {
                            w3h.h(w0hVar3);
                            w0hVar3.g.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            kd0Var3.remove(str);
                            bwgVar.F0(str, jLongValue, t8hVarE0);
                        }
                        if (kd0Var2.isEmpty()) {
                            long j2 = bwgVar.e;
                            if (j2 != 0) {
                                bwgVar.E0(j - j2, t8hVarE0);
                                bwgVar.e = 0L;
                            } else {
                                w3h.h(w0hVar3);
                                w0hVar3.g.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
