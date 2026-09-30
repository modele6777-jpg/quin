package defpackage;

import android.content.Context;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.personality.model.PersonalityAnalysis;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tk implements xj5 {
    public final /* synthetic */ xj5 a;

    public tk(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        sk skVar;
        if (xn2Var instanceof sk) {
            skVar = (sk) xn2Var;
            int i = skVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                skVar.label = i - Integer.MIN_VALUE;
            } else {
                skVar = new sk(this, xn2Var);
            }
        } else {
            skVar = new sk(this, xn2Var);
        }
        Object obj2 = skVar.result;
        int i2 = skVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List<PersonalityAnalysis> list = (List) obj;
            int i3 = 10;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            for (PersonalityAnalysis personalityAnalysis : list) {
                String testId = personalityAnalysis.getTestId();
                String name = personalityAnalysis.getName();
                String desc = personalityAnalysis.getDesc();
                LocalDate localDate = personalityAnalysis.getCreatedAt().toLocalDate();
                localDate.getClass();
                Context contextZ = cn1.z();
                th5 th5Var = cye.b;
                String strL = vpf.L(localDate, contextZ, fbc.d());
                LocalDate localDate2 = personalityAnalysis.getUpdatedAt().toLocalDate();
                localDate2.getClass();
                arrayList.add(new jaa(testId, name, desc, strL, vpf.L(localDate2, cn1.z(), fbc.d()), personalityAnalysis.isFinished()));
            }
            hk hkVar = new hk(s72.b1(arrayList, new ww2(i3)));
            skVar.L$0 = null;
            skVar.L$1 = null;
            skVar.L$2 = null;
            skVar.L$3 = null;
            skVar.label = 1;
            Object objA = this.a.a(hkVar, skVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
