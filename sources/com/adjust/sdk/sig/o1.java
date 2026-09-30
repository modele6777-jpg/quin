package com.adjust.sdk.sig;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 {
    public char[] a;
    public int b;

    public o1() {
        char[] cArr;
        i iVar = i.c;
        synchronized (iVar) {
            e eVar = iVar.a;
            cArr = null;
            char[] cArr2 = (char[]) (eVar.isEmpty() ? null : eVar.removeLast());
            if (cArr2 != null) {
                iVar.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        this.a = cArr == null ? new char[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS] : cArr;
    }

    public final void a() {
        i iVar = i.c;
        char[] cArr = this.a;
        synchronized (iVar) {
            int i = iVar.b;
            if (cArr.length + i < g.a) {
                iVar.b = i + cArr.length;
                iVar.a.addLast(cArr);
            }
        }
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }

    public final int a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.a = Arrays.copyOf(cArr, i3);
        }
        return i;
    }
}
