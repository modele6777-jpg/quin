package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ija {
    public final int a;
    public final x16 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final mk2[] f;
    public final nxc g;
    public final ad0 h;

    public ija(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
        this.f = new mk2[i];
        int i2 = oxc.a;
        this.g = new nxc(i);
        this.h = new ad0(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(zn2 zn2Var) {
        fja fjaVar;
        ad0 ad0Var = this.h;
        if (zn2Var instanceof fja) {
            fjaVar = (fja) zn2Var;
            int i = fjaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fjaVar.label = i - Integer.MIN_VALUE;
            } else {
                fjaVar = new fja(this, zn2Var);
            }
        } else {
            fjaVar = new fja(this, zn2Var);
        }
        Object obj = fjaVar.result;
        int i2 = fjaVar.label;
        nxc nxcVar = this.g;
        if (i2 == 0) {
            jzb.q(obj);
            fjaVar.label = 1;
            Object objA = nxcVar.a(fjaVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    p8c.x(21, "Connection pool is closed");
                    throw null;
                }
                if (ad0Var.isEmpty() && this.d < this.a) {
                    mk2 mk2Var = new mk2((q8c) this.b.invoke());
                    mk2[] mk2VarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    mk2VarArr[i3] = mk2Var;
                    ad0Var.addLast(mk2Var);
                }
                mk2 mk2Var2 = (mk2) ad0Var.removeLast();
                reentrantLock.unlock();
                return mk2Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            nxcVar.d();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:30:0x006d, B:32:0x0071, B:36:0x0079, B:40:0x0080), top: B:47:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:30:0x006d, B:32:0x0071, B:36:0x0079, B:40:0x0080), top: B:47:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:30:0x006d, B:32:0x0071, B:36:0x0079, B:40:0x0080), top: B:47:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x005a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r8, defpackage.mv0 r10, defpackage.zn2 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.gja
            if (r0 == 0) goto L13
            r0 = r11
            gja r0 = (defpackage.gja) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            gja r0 = new gja
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            long r8 = r0.J$0
            java.lang.Object r10 = r0.L$1
            mmb r10 = (defpackage.mmb) r10
            java.lang.Object r1 = r0.L$0
            x16 r1 = (defpackage.x16) r1
            defpackage.jzb.q(r11)     // Catch: java.lang.Throwable -> L30
            goto L5c
        L30:
            r11 = move-exception
            goto L68
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r3
        L38:
            defpackage.jzb.q(r11)
        L3b:
            mmb r11 = new mmb
            r11.<init>()
            hja r1 = new hja     // Catch: java.lang.Throwable -> L66
            r1.<init>(r11, r7, r3)     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L66
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L66
            r0.J$0 = r8     // Catch: java.lang.Throwable -> L66
            r0.label = r2     // Catch: java.lang.Throwable -> L66
            long r4 = defpackage.vfh.R(r8)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = defpackage.rs0.R(r4, r1, r0)     // Catch: java.lang.Throwable -> L66
            bw2 r4 = defpackage.bw2.a
            if (r1 != r4) goto L5a
            return r4
        L5a:
            r1 = r10
            r10 = r11
        L5c:
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r3
            goto L6d
        L61:
            r6 = r1
            r1 = r10
            r10 = r11
            r11 = r6
            goto L68
        L66:
            r1 = move-exception
            goto L61
        L68:
            r6 = r11
            r11 = r10
            r10 = r1
            r1 = r0
            r0 = r6
        L6d:
            boolean r4 = r0 instanceof defpackage.kye     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L77
            r10.invoke()     // Catch: java.lang.Throwable -> L75
            goto L7e
        L75:
            r8 = move-exception
            goto L81
        L77:
            if (r0 != 0) goto L80
            java.lang.Object r11 = r11.element     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L7e
            return r11
        L7e:
            r0 = r1
            goto L3b
        L80:
            throw r0     // Catch: java.lang.Throwable -> L75
        L81:
            java.lang.Object r9 = r11.element
            mk2 r9 = (defpackage.mk2) r9
            if (r9 == 0) goto L8a
            r7.e(r9)
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ija.b(long, mv0, zn2):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (mk2 mk2Var : this.f) {
                if (mk2Var != null) {
                    mk2Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        ad0 ad0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            c78 c78VarW = t72.w();
            int i = ad0Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                c78VarW.add(ad0Var.get(i2));
            }
            c78 c78VarN = c78VarW.n();
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(ud0.a.getIntVolatile(this.g, mxc.f), 0) + ", ");
            sb.append("queue=(size=" + c78VarN.c() + ")[" + s72.D0(c78VarN, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            mk2[] mk2VarArr = this.f;
            int length = mk2VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                mk2 mk2Var = mk2VarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(mk2Var != null ? mk2Var.a.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (mk2Var != null) {
                    mk2Var.l(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(mk2 mk2Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(mk2Var);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
