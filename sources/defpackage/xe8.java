package defpackage;

import java.io.PrintStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xe8 implements yoa {
    public static final xe8 b = new xe8(System.out);
    public final PrintStream a;

    public xe8(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.yoa
    public final Object b(Object obj, String str, List list) throws ci7 {
        if (list.isEmpty()) {
            throw new ci7("log operator requires exactly 1 argument", str);
        }
        Object obj2 = list.get(0);
        this.a.println("JsonLogic: " + obj2);
        return obj2;
    }

    @Override // defpackage.ei7
    public final String c() {
        return "log";
    }
}
