package defpackage;

import ai.askquin.data.SeasonalReadingStore$Snapshot;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;
import tech.chatmind.api.seasonal.model.SeasonalHistoryResponse;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SolarTerm;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lqc implements hf8 {
    public static final /* synthetic */ int c = 0;
    public final mqc a;
    public final epc b;

    public lqc(mqc mqcVar, epc epcVar) {
        this.a = mqcVar;
        this.b = epcVar;
    }

    public static upc h(SeasonalReadingResponse seasonalReadingResponse) {
        int i = vpc.a[seasonalReadingResponse.getStatus().ordinal()];
        if (i == 1) {
            return new spc(seasonalReadingResponse);
        }
        if (i != 2) {
            return null;
        }
        return new opc(seasonalReadingResponse.getErrorMessage());
    }

    public static upc i(Exception exc) {
        Throwable thB = nzc.b(exc);
        boolean z = thB instanceof jzc;
        if (z && ((jzc) thB).getErrorCode() == 60002) {
            return qpc.a;
        }
        if (!z) {
            return new rpc(exc);
        }
        String message = thB.getMessage();
        String str = null;
        if (message != null) {
            if (v4e.Q(message)) {
                message = null;
            }
            str = message;
        }
        return new opc(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, SolarTerm solarTerm, zn2 zn2Var) {
        wpc wpcVar;
        if (zn2Var instanceof wpc) {
            wpcVar = (wpc) zn2Var;
            int i2 = wpcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wpcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                wpcVar = new wpc(this, zn2Var);
            }
        } else {
            wpcVar = new wpc(this, zn2Var);
        }
        Object objB = wpcVar.result;
        int i3 = wpcVar.label;
        if (i3 == 0) {
            jzb.q(objB);
            xpc xpcVar = new xpc(this, i, solarTerm, null);
            wpcVar.L$0 = null;
            wpcVar.I$0 = i;
            wpcVar.label = 1;
            objB = lw2.b(xpcVar, wpcVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot = (SeasonalReadingStore$Snapshot) objB;
        if (seasonalReadingStore$Snapshot == null) {
            return null;
        }
        return new SeasonalReadingResponse(SeasonalStatus.READY, seasonalReadingStore$Snapshot.getUserInfo(), seasonalReadingStore$Snapshot.getCards(), seasonalReadingStore$Snapshot.getReading(), seasonalReadingStore$Snapshot.getFollowUps(), null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(int i, SolarTerm solarTerm, zn2 zn2Var) {
        eqc eqcVar;
        int i2;
        SolarTerm solarTerm2;
        if (zn2Var instanceof eqc) {
            eqcVar = (eqc) zn2Var;
            int i3 = eqcVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eqcVar.label = i3 - Integer.MIN_VALUE;
            } else {
                eqcVar = new eqc(this, zn2Var);
            }
        } else {
            eqcVar = new eqc(this, zn2Var);
        }
        eqc eqcVar2 = eqcVar;
        Object objA = eqcVar2.result;
        int i4 = eqcVar2.label;
        Object obj = bw2.a;
        if (i4 == 0) {
            jzb.q(objA);
            ync yncVar = ync.a;
            solarTerm.getClass();
            SeasonalReadingResponse seasonalReadingResponseA = ync.a(yncVar, i, solarTerm, null, null, null, 28);
            if (seasonalReadingResponseA != null) {
                return seasonalReadingResponseA;
            }
            eqcVar2.L$0 = solarTerm;
            eqcVar2.I$0 = i;
            eqcVar2.label = 1;
            objA = ((rqc) this.a).a(i, solarTerm, eqcVar2);
            if (objA != obj) {
                i2 = i;
                solarTerm2 = solarTerm;
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = eqcVar2.L$2;
            jzb.q(objA);
            return obj2;
        }
        i2 = eqcVar2.I$0;
        solarTerm2 = (SolarTerm) eqcVar2.L$0;
        jzb.q(objA);
        ServerResponse serverResponse = (ServerResponse) objA;
        if (!serverResponse.getSuccess()) {
            qc0.p("Seasonal reading request failed");
            return null;
        }
        Object data = serverResponse.getData();
        SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) data;
        if (seasonalReadingResponse.getStatus() == SeasonalStatus.UNKNOWN) {
            qc0.p("Unknown seasonal reading status");
            return null;
        }
        if (seasonalReadingResponse.getStatus() == SeasonalStatus.READY) {
            eqcVar2.L$0 = null;
            eqcVar2.L$1 = null;
            eqcVar2.L$2 = data;
            eqcVar2.L$3 = null;
            eqcVar2.I$0 = i2;
            eqcVar2.label = 2;
            if (g(i2, solarTerm2, seasonalReadingResponse, eqcVar2) == obj) {
                return obj;
            }
        }
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(zn2 zn2Var) throws Throwable {
        fqc fqcVar;
        if (zn2Var instanceof fqc) {
            fqcVar = (fqc) zn2Var;
            int i = fqcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqcVar.label = i - Integer.MIN_VALUE;
            } else {
                fqcVar = new fqc(this, zn2Var);
            }
        } else {
            fqcVar = new fqc(this, zn2Var);
        }
        Object objP0 = fqcVar.result;
        int i2 = fqcVar.label;
        pu4 pu4Var = pu4.a;
        try {
            if (i2 == 0) {
                jzb.q(objP0);
                ync yncVar = ync.a;
                List listH = v2c.p() == null ? null : t72.H(new SeasonalHistoryItem(2026, SolarTerm.AUTUMN_EQUINOX, "2026-09-23T10:00:00+08:00"));
                if (listH != null) {
                    return listH;
                }
                mqc mqcVar = this.a;
                fqcVar.label = 1;
                js3 js3Var = ga4.a;
                objP0 = ynb.p0(hr3.c, new pqc((rqc) mqcVar, null), fqcVar);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objP0);
            }
            ServerResponse serverResponse = (ServerResponse) objP0;
            if (serverResponse.getSuccess()) {
                return ((SeasonalHistoryResponse) serverResponse.getData()).getItems();
            }
            d().b("Seasonal getHistory returned success=false: " + serverResponse.getErrorMessage());
            return pu4Var;
        } catch (Exception e) {
            ynb.h0(e);
            d().c("Failed to fetch seasonal history", e);
            return pu4Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5 A[Catch: Exception -> 0x00fa, TryCatch #2 {Exception -> 0x00fa, blocks: (B:42:0x00bd, B:44:0x00c5, B:50:0x00fc, B:52:0x010a), top: B:71:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc A[Catch: Exception -> 0x00fa, TryCatch #2 {Exception -> 0x00fa, blocks: (B:42:0x00bd, B:44:0x00c5, B:50:0x00fc, B:52:0x010a), top: B:71:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #2 {Exception -> 0x00fa, blocks: (B:42:0x00bd, B:44:0x00c5, B:50:0x00fc, B:52:0x010a), top: B:71:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        if (g(r2, r4, r3, r10) == r13) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        if (r0 == r13) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00c5, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(int r19, tech.chatmind.api.seasonal.model.SolarTerm r20, defpackage.zn2 r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.e(int, tech.chatmind.api.seasonal.model.SolarTerm, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i, SolarTerm solarTerm, zn2 zn2Var) {
        hqc hqcVar;
        Object dzbVar;
        if (zn2Var instanceof hqc) {
            hqcVar = (hqc) zn2Var;
            int i2 = hqcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hqcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hqcVar = new hqc(this, zn2Var);
            }
        } else {
            hqcVar = new hqc(this, zn2Var);
        }
        Object objA = hqcVar.result;
        int i3 = hqcVar.label;
        boolean z = true;
        try {
            if (i3 == 0) {
                jzb.q(objA);
                mqc mqcVar = this.a;
                hqcVar.L$0 = null;
                hqcVar.L$1 = null;
                hqcVar.I$0 = i;
                hqcVar.label = 1;
                objA = ((rqc) mqcVar).a(i, solarTerm, hqcVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objA);
            }
            dzbVar = (ServerResponse) objA;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        ServerResponse serverResponse = (ServerResponse) (dzbVar instanceof dzb ? null : dzbVar);
        if (serverResponse == null) {
            return Boolean.FALSE;
        }
        if (!serverResponse.getSuccess()) {
            return Boolean.FALSE;
        }
        if (((SeasonalReadingResponse) serverResponse.getData()).getStatus() != SeasonalStatus.PROCESSING && ((SeasonalReadingResponse) serverResponse.getData()).getStatus() != SeasonalStatus.READY) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i, SolarTerm solarTerm, SeasonalReadingResponse seasonalReadingResponse, zn2 zn2Var) {
        iqc iqcVar;
        Object dzbVar;
        List<SeasonalCard> cards;
        if (zn2Var instanceof iqc) {
            iqcVar = (iqc) zn2Var;
            int i2 = iqcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iqcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                iqcVar = new iqc(this, zn2Var);
            }
        } else {
            iqcVar = new iqc(this, zn2Var);
        }
        Object obj = iqcVar.result;
        int i3 = iqcVar.label;
        wef wefVar = wef.a;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                SeasonalReading reading = seasonalReadingResponse.getReading();
                if (reading != null && (cards = seasonalReadingResponse.getCards()) != null) {
                    epc epcVar = this.b;
                    SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot = new SeasonalReadingStore$Snapshot(cards, reading, seasonalReadingResponse.getUserInfo(), seasonalReadingResponse.getFollowUps());
                    iqcVar.L$0 = solarTerm;
                    iqcVar.L$1 = null;
                    iqcVar.L$2 = null;
                    iqcVar.L$3 = null;
                    iqcVar.L$4 = null;
                    iqcVar.I$0 = i;
                    iqcVar.label = 1;
                    Object objC = epcVar.c(i, solarTerm, seasonalReadingStore$Snapshot, iqcVar);
                    bw2 bw2Var = bw2.a;
                    if (objC == bw2Var) {
                        return bw2Var;
                    }
                }
                return wefVar;
            }
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = iqcVar.I$0;
            solarTerm = (SolarTerm) iqcVar.L$0;
            jzb.q(obj);
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            d().c("Failed to cache seasonal snapshot " + i + "/" + solarTerm, thA);
        }
        return wefVar;
    }
}
