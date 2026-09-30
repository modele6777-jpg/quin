package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwe2;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lqk9;", "", "instances", "Lqk9;", "reused", "Lr67;", "operations", "Lr67;", "", "lastOperation", "I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class we2 extends RuntimeException {
    private final qk9 instances;
    private final int lastOperation;
    private final r67 operations;
    private final qk9 reused;

    public we2(qk9 qk9Var, i79 i79Var, r67 r67Var, int i, Exception exc) {
        super(exc);
        this.instances = qk9Var;
        this.reused = i79Var;
        this.operations = r67Var;
        this.lastOperation = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() throws IOException {
        List listH;
        int i = this.lastOperation;
        dyc dycVarI = dec.i(new ve2(this, null));
        if (dycVarI.hasNext()) {
            Object next = dycVarI.next();
            if (dycVarI.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dycVarI.hasNext()) {
                    arrayList.add(dycVarI.next());
                }
                listH = arrayList;
            } else {
                listH = t72.H(next);
            }
        } else {
            listH = pu4.a;
        }
        return w4e.q("\n            |Failed to execute op number " + i + ":\n            |" + s72.D0(s72.d1(50, listH), "\n", null, null, null, 62) + "\n            ");
    }
}
