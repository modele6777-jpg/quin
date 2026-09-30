package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ge5 extends g2 {
    public final ArrayDeque c;
    public final /* synthetic */ ie5 d;

    public ge5(ie5 ie5Var) {
        this.d = ie5Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = (File) ie5Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (file.isFile()) {
            arrayDeque.push(new ee5(file));
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.g2
    public final void b() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            he5 he5Var = (he5) arrayDeque.peek();
            if (he5Var == null) {
                file = null;
                break;
            }
            File fileA = he5Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(he5Var.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(c(fileA));
            }
        }
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public final ce5 c(File file) {
        int iOrdinal = ((je5) this.d.c).ordinal();
        if (iOrdinal == 0) {
            return new fe5(file);
        }
        if (iOrdinal == 1) {
            return new de5(file);
        }
        ap.c();
        return null;
    }
}
