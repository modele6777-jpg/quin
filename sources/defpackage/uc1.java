package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final kd9 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final d3e i;
    public final i4e j;
    public final long k;
    public final za2 l;
    public volatile Integer m;

    public uc1(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, kd9 kd9Var, ArrayMap arrayMap, ArrayMap arrayMap2, d3e d3eVar, i4e i4eVar) {
        str.getClass();
        list.getClass();
        i4eVar.getClass();
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = kd9Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = d3eVar;
        this.j = i4eVar;
        yh0 yh0Var = xc1.b;
        yh0Var.getClass();
        this.k = yh0.b.incrementAndGet(yh0Var);
        this.l = new za2();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        qc0.p("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.m != null) {
            Integer num = this.m;
            if (num != null) {
                return num.intValue();
            }
            oo3.g(33, this, "SequenceNumber has not been set for ");
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(qtb qtbVar, long j, ptb ptbVar) {
        this.f.I(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((atb) list.get(i)).g0(qtbVar, j, ptbVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVar.h().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((atb) qtbVar.h().d.get(i2)).g0(qtbVar, j, ptbVar);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.I(this);
        Trace.endSection();
        qtb qtbVarI = i(captureRequest);
        ds dsVar = new ds(totalCaptureResult, this.a, qtbVarI);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((atb) list.get(i)).R(qtbVarI, j, dsVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((atb) qtbVarI.h().d.get(i2)).R(qtbVarI, j, dsVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((atb) list.get(i3)).h0(qtbVarI, j, dsVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = qtbVarI.h().d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((atb) qtbVarI.h().d.get(i4)).h0(qtbVarI, j, dsVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.R(wef.a);
        qtb qtbVarI = i(captureRequest);
        b(qtbVarI, j, new q85(qtbVarI, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        qtb qtbVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((atb) list.get(i2)).N(qtbVarI, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((atb) qtbVarI.h().d.get(i3)).N(qtbVarI, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.R(wef.a);
        this.f.I(this);
        if (a() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            b1.l("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qtb qtbVar = (qtb) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((atb) list.get(i3)).E(qtbVar);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            qtb qtbVar2 = (qtb) arrayList.get(i4);
            int size4 = qtbVar2.h().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((atb) qtbVar2.h().d.get(i5)).E(qtbVar2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.R(wef.a);
        this.f.I(this);
        if (a() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            b1.l("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qtb qtbVar = (qtb) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((atb) list.get(i3)).x(qtbVar, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            qtb qtbVar2 = (qtb) arrayList.get(i4);
            int size4 = qtbVar2.h().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((atb) qtbVar2.h().d.get(i5)).x(qtbVar2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.R(wef.a);
        qtb qtbVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((atb) list.get(i)).G(qtbVarI, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((atb) qtbVarI.h().d.get(i2)).G(qtbVarI, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final qtb i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (qtb) this.d.get(i);
            }
        }
        s8f.k("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        c3e c3eVar;
        Object next;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        e3e e3eVar = (e3e) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (e3eVar == null) {
            qt9 qt9Var = (qt9) arrayMap.get(surface);
            e3e e3eVar2 = null;
            if (qt9Var != null) {
                int i = qt9Var.a;
                Iterator it = this.i.v.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((c3e) next).a != i);
                c3eVar = (c3e) next;
            } else {
                c3eVar = null;
            }
            if (c3eVar != null) {
                xj1 xj1Var = c3eVar.j;
                if (xj1Var == null) {
                    pa7.g0("stream");
                    throw null;
                }
                e3eVar2 = new e3e(xj1Var.a);
            }
            e3eVar = e3eVar2;
        }
        qt9 qt9Var2 = (qt9) arrayMap.get(surface);
        if (e3eVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            qc0.m(sb, " on ", yy5.a(j));
            return;
        }
        if (qt9Var2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            qc0.m(sb2, " on ", yy5.a(j));
            return;
        }
        qtb qtbVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((atb) list.get(i2)).getClass();
            qtbVarI.getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((atb) qtbVarI.h().d.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((atb) list.get(i4)).h(qtbVarI, j, e3eVar.a, qt9Var2.a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = qtbVarI.h().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((atb) qtbVarI.h().d.get(i5)).h(qtbVarI, j, e3eVar.a, qt9Var2.a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.R(wef.a);
        qtb qtbVarI = i(captureRequest);
        b(qtbVarI, captureFailure.getFrameNumber(), new np(qtbVarI, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        es esVar = new es(captureResult, this.a);
        qtb qtbVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((atb) list.get(i)).W(qtbVarI, frameNumber, esVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((atb) qtbVarI.h().d.get(i2)).W(qtbVarI, frameNumber, esVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        h(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        qtb qtbVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((atb) list.get(i)).l(qtbVarI, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = qtbVarI.h().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((atb) qtbVarI.h().d.get(i2)).l(qtbVarI, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
