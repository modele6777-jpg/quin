package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;
import tech.chatmind.api.personality.model.UserDecision;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y5b extends gbe implements l26 {
    final /* synthetic */ int $questionIndex;
    final /* synthetic */ List<PersonalityAnalysisQuestion> $questions;
    final /* synthetic */ int $rate;
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ a6b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5b(List list, a6b a6bVar, int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$questions = list;
        this.this$0 = a6bVar;
        this.$questionIndex = i;
        this.$rate = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y5b(this.$questions, this.this$0, this.$questionIndex, this.$rate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long jCurrentTimeMillis;
        Object objB;
        long j;
        Object obj2;
        int i;
        List<PersonalityAnalysisQuestion> list;
        a6b a6bVar;
        boolean zBooleanValue;
        long jCurrentTimeMillis2;
        int i2;
        long j2;
        long j3;
        wg6 wg6Var;
        w5b w5bVar;
        Object obj3;
        int i3;
        a6b a6bVar2;
        List<PersonalityAnalysisQuestion> list2;
        wg6 wg6Var2;
        x5b x5bVar;
        int i4 = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i4 == 0) {
            jzb.q(obj);
            List<PersonalityAnalysisQuestion> list3 = this.$questions;
            int i5 = this.$questionIndex;
            int i6 = this.$rate;
            ArrayList arrayList = new ArrayList(t72.u(list3, 10));
            int i7 = 0;
            for (Object obj4 : list3) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    t72.Z();
                    throw null;
                }
                PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) obj4;
                if (i5 == i7) {
                    personalityAnalysisQuestion = new PersonalityAnalysisQuestion(personalityAnalysisQuestion.getQuestion(), new UserDecision(i6));
                }
                arrayList.add(personalityAnalysisQuestion);
                i7 = i8;
            }
            s0e s0eVar = this.this$0.e;
            s0eVar.getClass();
            s0eVar.n(null, arrayList);
            jCurrentTimeMillis = System.currentTimeMillis();
            a6b a6bVar3 = this.this$0;
            hba hbaVar = a6bVar3.b;
            String str = a6bVar3.c;
            int i9 = this.$questionIndex;
            int i10 = this.$rate;
            this.L$0 = null;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            objB = ((sba) hbaVar).b(str, i9, i10, this);
            if (objB != bw2Var) {
            }
            return bw2Var;
        }
        if (i4 == 1) {
            jCurrentTimeMillis = this.J$0;
            jzb.q(obj);
            objB = ((ezb) obj).b();
        } else {
            if (i4 == 2) {
                jCurrentTimeMillis2 = this.J$1;
                zBooleanValue = this.Z$0;
                i = this.I$0;
                j = this.J$0;
                a6bVar = (a6b) this.L$3;
                list = (List) this.L$2;
                obj2 = this.L$1;
                jzb.q(obj);
                i2 = i;
                j2 = jCurrentTimeMillis2;
                j3 = j;
                if (!zBooleanValue) {
                    js3 js3Var = ga4.a;
                    wg6Var = mk8.a;
                    w5bVar = new w5b(2, null);
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.J$0 = j3;
                    this.Z$0 = zBooleanValue;
                    this.J$1 = j2;
                    this.label = 3;
                    if (ynb.p0(wg6Var, w5bVar, this) != bw2Var) {
                        obj3 = obj2;
                    }
                    return bw2Var;
                }
                i3 = i2 + 1;
                if (i3 < list.size()) {
                    if (i3 < 0) {
                        a6bVar.getClass();
                    } else {
                        s0e s0eVar2 = a6bVar.d;
                        Integer numValueOf = Integer.valueOf(i3);
                        s0eVar2.getClass();
                        s0eVar2.n(null, numValueOf);
                    }
                    j = j3;
                    a6bVar2 = this.this$0;
                    list2 = this.$questions;
                    if (ezb.a(obj2) != null) {
                        a6bVar2.e.m(list2);
                        js3 js3Var2 = ga4.a;
                        wg6Var2 = mk8.a;
                        x5bVar = new x5b(2, null);
                        this.L$0 = null;
                        this.L$1 = obj2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.J$0 = j;
                        this.label = 4;
                        if (ynb.p0(wg6Var2, x5bVar, this) == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
                return wefVar;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return wefVar;
            }
            j3 = this.J$0;
            obj3 = this.L$1;
            jzb.q(obj);
        }
        obj2 = obj3;
        j = j3;
        a6bVar2 = this.this$0;
        list2 = this.$questions;
        if (ezb.a(obj2) != null) {
            a6bVar2.e.m(list2);
            js3 js3Var3 = ga4.a;
            wg6Var2 = mk8.a;
            x5bVar = new x5b(2, null);
            this.L$0 = null;
            this.L$1 = obj2;
            this.L$2 = null;
            this.L$3 = null;
            this.J$0 = j;
            this.label = 4;
            if (ynb.p0(wg6Var2, x5bVar, this) == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
        j = jCurrentTimeMillis;
        obj2 = objB;
        i = this.$questionIndex;
        list = this.$questions;
        a6bVar = this.this$0;
        if (obj2 instanceof dzb) {
            a6bVar2 = this.this$0;
            list2 = this.$questions;
            if (ezb.a(obj2) != null) {
                a6bVar2.e.m(list2);
                js3 js3Var4 = ga4.a;
                wg6Var2 = mk8.a;
                x5bVar = new x5b(2, null);
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = j;
                this.label = 4;
                if (ynb.p0(wg6Var2, x5bVar, this) == bw2Var) {
                }
            }
            return wefVar;
        }
        zBooleanValue = ((Boolean) obj2).booleanValue();
        jCurrentTimeMillis2 = 400 - (System.currentTimeMillis() - j);
        if (jCurrentTimeMillis2 > 0) {
            this.L$0 = null;
            this.L$1 = obj2;
            this.L$2 = list;
            this.L$3 = a6bVar;
            this.J$0 = j;
            this.I$0 = i;
            this.Z$0 = zBooleanValue;
            this.J$1 = jCurrentTimeMillis2;
            this.label = 2;
            if (vfh.q(jCurrentTimeMillis2, this) != bw2Var) {
            }
        }
        i2 = i;
        j2 = jCurrentTimeMillis2;
        j3 = j;
        if (!zBooleanValue) {
            i3 = i2 + 1;
            if (i3 < list.size()) {
                if (i3 < 0) {
                    a6bVar.getClass();
                } else {
                    s0e s0eVar3 = a6bVar.d;
                    Integer numValueOf2 = Integer.valueOf(i3);
                    s0eVar3.getClass();
                    s0eVar3.n(null, numValueOf2);
                }
                j = j3;
                a6bVar2 = this.this$0;
                list2 = this.$questions;
                if (ezb.a(obj2) != null) {
                    a6bVar2.e.m(list2);
                    js3 js3Var5 = ga4.a;
                    wg6Var2 = mk8.a;
                    x5bVar = new x5b(2, null);
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.J$0 = j;
                    this.label = 4;
                    if (ynb.p0(wg6Var2, x5bVar, this) == bw2Var) {
                    }
                }
            }
            return wefVar;
        }
        js3 js3Var6 = ga4.a;
        wg6Var = mk8.a;
        w5bVar = new w5b(2, null);
        this.L$0 = null;
        this.L$1 = obj2;
        this.L$2 = null;
        this.L$3 = null;
        this.J$0 = j3;
        this.Z$0 = zBooleanValue;
        this.J$1 = j2;
        this.label = 3;
        if (ynb.p0(wg6Var, w5bVar, this) != bw2Var) {
            obj3 = obj2;
            obj2 = obj3;
            j = j3;
            a6bVar2 = this.this$0;
            list2 = this.$questions;
            if (ezb.a(obj2) != null) {
                a6bVar2.e.m(list2);
                js3 js3Var7 = ga4.a;
                wg6Var2 = mk8.a;
                x5bVar = new x5b(2, null);
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = j;
                this.label = 4;
                if (ynb.p0(wg6Var2, x5bVar, this) == bw2Var) {
                }
            }
            return wefVar;
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y5b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
