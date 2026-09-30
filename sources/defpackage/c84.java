package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc84;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lif2;", "trace", "Lif2;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class c84 extends RuntimeException {
    private final if2 trace;

    public c84(if2 if2Var) {
        this.trace = if2Var;
        if (if2Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = if2Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            kf2 kf2Var = (kf2) list.get(i);
            if (!qd0.T(iArr, kf2Var.a)) {
                if (kf2Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((kf2) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        x72.l0(arrayList);
                    }
                } else {
                    arrayList.add(kf2Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", tec.e(((kf2) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (!this.trace.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        if2 if2Var = this.trace;
        c78 c78VarW = t72.w();
        List list = if2Var.a;
        list.getClass();
        sm8 sm8Var = new sm8(list);
        int iC = sm8Var.c();
        for (int i = 0; i < iC; i++) {
            ((kf2) sm8Var.get(i)).getClass();
        }
        c78 c78VarN = c78VarW.n();
        c78VarN.getClass();
        sm8 sm8Var2 = new sm8(c78VarN);
        int iC2 = sm8Var2.c();
        for (int i2 = 0; i2 < iC2; i2++) {
            String str = (String) sm8Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
