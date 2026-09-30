package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j6b implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6b b;
    public final /* synthetic */ x6b c;

    public /* synthetic */ j6b(n6b n6bVar, x6b x6bVar, int i) {
        this.a = i;
        this.b = n6bVar;
        this.c = x6bVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        int i = this.a;
        x6b x6bVar = this.c;
        n6b n6bVar = this.b;
        q8c q8cVar = (q8c) obj;
        switch (i) {
            case 0:
                q8cVar.getClass();
                ax3 ax3Var = n6bVar.b;
                if (x6bVar == null) {
                    j = -1;
                } else {
                    x8c x8cVarW0 = q8cVar.W0("INSERT OR ABORT INTO `quick_decision` (`id`,`cardKey`,`isReversed`,`answer`,`tagline`,`reading`,`drawnAt`,`chatId`,`syncedAt`,`accountId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)");
                    try {
                        ax3Var.p(x8cVarW0, x6bVar);
                        x8cVarW0.R0();
                        cgg.t(x8cVarW0, null);
                        if (r8c.h(q8cVar) == 0) {
                            j = -1;
                        } else {
                            x8c x8cVarW1 = q8cVar.W0("SELECT last_insert_rowid()");
                            try {
                                x8cVarW1.R0();
                                long j2 = x8cVarW1.getLong(0);
                                cgg.t(x8cVarW1, null);
                                j = j2;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    cgg.t(x8cVarW1, th);
                                    throw th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            cgg.t(x8cVarW0, th3);
                            throw th4;
                        }
                    }
                }
                return Long.valueOf(j);
            default:
                q8cVar.getClass();
                n6bVar.d.U(q8cVar, x6bVar);
                return wef.a;
        }
    }
}
