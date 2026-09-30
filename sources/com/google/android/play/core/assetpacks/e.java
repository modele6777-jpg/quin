package com.google.android.play.core.assetpacks;

import defpackage.pfg;
import defpackage.qgg;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends FilterInputStream {
    public final qgg a;
    public byte[] b;
    public long c;
    public boolean d;
    public boolean e;

    public e(InputStream inputStream) {
        super(inputStream);
        this.a = new qgg();
        this.b = new byte[4096];
        this.d = false;
        this.e = false;
    }

    public final pfg b() {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new pfg(null, -1L, -1, false, false, null);
        }
        boolean zH = h(30);
        qgg qggVar = this.a;
        if (!zH) {
            this.d = true;
            return qggVar.b();
        }
        pfg pfgVarB = qggVar.b();
        if (pfgVarB.e) {
            this.e = true;
            return pfgVarB;
        }
        if (pfgVarB.b == 4294967295L) {
            throw new g("Files bigger than 4GiB are not supported.");
        }
        int i = qggVar.f - 30;
        int length = this.b.length;
        long j = i;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.b = Arrays.copyOf(this.b, length);
        }
        if (!h(i)) {
            this.d = true;
            return qggVar.b();
        }
        pfg pfgVarB2 = qggVar.b();
        this.c = pfgVarB2.b;
        return pfgVarB2;
    }

    public final boolean h(int i) {
        int iMax = Math.max(0, super.read(this.b, 0, i));
        qgg qggVar = this.a;
        if (iMax != i) {
            int i2 = i - iMax;
            if (Math.max(0, super.read(this.b, iMax, i2)) != i2) {
                qggVar.a(this.b, 0, iMax);
                return false;
            }
        }
        qggVar.a(this.b, 0, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int iMax = Math.max(0, super.read(bArr, i, (int) Math.min(j, i2)));
        this.c -= (long) iMax;
        if (iMax != 0) {
            return iMax;
        }
        this.d = true;
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
