package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qqf implements a26 {
    public static final qqf b = new qqf(0);
    public static final qqf c = new qqf(1);
    public static final qqf d = new qqf(2);
    public final /* synthetic */ int a;

    public /* synthetic */ qqf(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                yn7 yn7Var = (yn7) obj;
                dx5 dx5Var = sqf.a;
                yn7Var.getClass();
                return sqf.s(yn7Var);
            case 1:
                return null;
            case 2:
                y72 y72Var = (y72) obj;
                long j = y72Var.a;
                return y72Var;
            case 3:
                ((zt7) obj).getClass();
                return null;
            case 4:
                ((j22) obj).getClass();
                return ntd.T;
            case 5:
                ea1 ea1Var = (ea1) obj;
                if (ea1Var.g() == 1) {
                    bm3 bm3VarK = ea1Var.k();
                    bm3VarK.getClass();
                    String str = qf7.a;
                    z = qf7.j.containsKey(oz3.f((u09) bm3VarK));
                }
                return Boolean.valueOf(z);
            case 6:
                return ((ce8) obj).b.invoke();
            case 7:
                return (ea1) obj;
            case 8:
                return (ea1) obj;
            case 9:
                nid nidVar = (nid) obj;
                nidVar.getClass();
                String strConcat = "java/util/".concat("Spliterator");
                wf7 wf7Var = kpa.b;
                nidVar.c(strConcat, wf7Var, wf7Var);
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                throw new IndexOutOfBoundsException(tec.k("Empty list doesn't contain element at index ", ((Number) obj).intValue(), '.'));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                throw new IndexOutOfBoundsException(tec.k("Empty list doesn't contain element at index ", ((Number) obj).intValue(), '.'));
            default:
                dx5 dx5Var2 = (dx5) obj;
                if (dx5Var2 != null) {
                    return Boolean.valueOf(!dx5Var2.equals(syd.y));
                }
                qc0.j("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }

    public /* synthetic */ qqf(int i, Object obj) {
        this.a = i;
    }
}
