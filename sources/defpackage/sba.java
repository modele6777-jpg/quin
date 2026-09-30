package defpackage;

import tech.chatmind.api.personality.model.CreateExaminationResponse;
import tech.chatmind.api.personality.model.RatingRequestBody;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sba implements hba, hf8 {
    public final maa a;

    public sba(maa maaVar) {
        this.a = maaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        iba ibaVar;
        if (zn2Var instanceof iba) {
            ibaVar = (iba) zn2Var;
            int i = ibaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibaVar.label = i - Integer.MIN_VALUE;
            } else {
                ibaVar = new iba(this, zn2Var);
            }
        } else {
            ibaVar = new iba(this, zn2Var);
        }
        Object objB = ibaVar.result;
        int i2 = ibaVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            ibaVar.label = 1;
            objB = this.a.b(ibaVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        return ((CreateExaminationResponse) ((ServerResponse) objB).getData()).getExaminationId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, int i, int i2, zn2 zn2Var) {
        lba lbaVar;
        Object dzbVar;
        if (zn2Var instanceof lba) {
            lbaVar = (lba) zn2Var;
            int i3 = lbaVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lbaVar.label = i3 - Integer.MIN_VALUE;
            } else {
                lbaVar = new lba(this, zn2Var);
            }
        } else {
            lbaVar = new lba(this, zn2Var);
        }
        Object objC = lbaVar.result;
        int i4 = lbaVar.label;
        try {
            if (i4 == 0) {
                jzb.q(objC);
                maa maaVar = this.a;
                RatingRequestBody ratingRequestBody = new RatingRequestBody(str, i, i2);
                lbaVar.L$0 = null;
                lbaVar.I$0 = i;
                lbaVar.I$1 = i2;
                lbaVar.label = 1;
                objC = maaVar.c(ratingRequestBody, lbaVar);
                bw2 bw2Var = bw2.a;
                if (objC == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i4 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objC);
            }
            dzbVar = new ezb(Boolean.valueOf(((ServerResponse) objC).getSuccess()));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            ynb.h0(thA);
            d().c("Rate for question failed", thA);
            dzbVar = new ezb(new dzb(thA));
        }
        return ((ezb) dzbVar).b();
    }
}
