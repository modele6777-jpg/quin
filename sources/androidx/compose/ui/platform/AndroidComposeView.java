package androidx.compose.ui.platform;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a26;
import defpackage.a57;
import defpackage.a91;
import defpackage.ad0;
import defpackage.ap;
import defpackage.av4;
import defpackage.b28;
import defpackage.bea;
import defpackage.bo5;
import defpackage.bw2;
import defpackage.bxc;
import defpackage.c47;
import defpackage.c52;
import defpackage.cb7;
import defpackage.cv7;
import defpackage.cxc;
import defpackage.d52;
import defpackage.d58;
import defpackage.dea;
import defpackage.dkb;
import defpackage.do5;
import defpackage.dq;
import defpackage.dw3;
import defpackage.dx3;
import defpackage.e58;
import defpackage.e7g;
import defpackage.e89;
import defpackage.ead;
import defpackage.eh6;
import defpackage.em7;
import defpackage.eq;
import defpackage.eue;
import defpackage.ew9;
import defpackage.ex;
import defpackage.ey2;
import defpackage.f58;
import defpackage.f6;
import defpackage.f7g;
import defpackage.fe;
import defpackage.fpa;
import defpackage.fz3;
import defpackage.g0g;
import defpackage.gg8;
import defpackage.gte;
import defpackage.gw9;
import defpackage.h27;
import defpackage.h48;
import defpackage.hj6;
import defpackage.hkb;
import defpackage.hl;
import defpackage.hrd;
import defpackage.i09;
import defpackage.i27;
import defpackage.i37;
import defpackage.i79;
import defpackage.ie6;
import defpackage.if9;
import defpackage.iqf;
import defpackage.ird;
import defpackage.is;
import defpackage.ite;
import defpackage.iu;
import defpackage.j27;
import defpackage.j6c;
import defpackage.jgb;
import defpackage.jkb;
import defpackage.job;
import defpackage.jt4;
import defpackage.ju;
import defpackage.jzb;
import defpackage.k6c;
import defpackage.kdc;
import defpackage.ke6;
import defpackage.kl2;
import defpackage.km0;
import defpackage.ko5;
import defpackage.kv;
import defpackage.kv2;
import defpackage.kwf;
import defpackage.kxa;
import defpackage.l26;
import defpackage.l47;
import defpackage.l6c;
import defpackage.ld5;
import defpackage.lp;
import defpackage.lq;
import defpackage.lqb;
import defpackage.m47;
import defpackage.mec;
import defpackage.mg8;
import defpackage.mia;
import defpackage.mjg;
import defpackage.mmb;
import defpackage.mn5;
import defpackage.mq;
import defpackage.msd;
import defpackage.mx3;
import defpackage.n39;
import defpackage.n6;
import defpackage.ne6;
import defpackage.ni;
import defpackage.nia;
import defpackage.nq;
import defpackage.nsd;
import defpackage.nvf;
import defpackage.o09;
import defpackage.o39;
import defpackage.o47;
import defpackage.oa7;
import defpackage.oid;
import defpackage.oo3;
import defpackage.oo5;
import defpackage.owf;
import defpackage.ozb;
import defpackage.p;
import defpackage.p60;
import defpackage.p89;
import defpackage.pa7;
import defpackage.pb2;
import defpackage.pcg;
import defpackage.pl6;
import defpackage.pr;
import defpackage.pr4;
import defpackage.pv2;
import defpackage.pwf;
import defpackage.q1c;
import defpackage.q4a;
import defpackage.q69;
import defpackage.qc0;
import defpackage.qf2;
import defpackage.qia;
import defpackage.qk2;
import defpackage.qk6;
import defpackage.qm2;
import defpackage.qn4;
import defpackage.qq;
import defpackage.qrd;
import defpackage.qs9;
import defpackage.que;
import defpackage.r2f;
import defpackage.r69;
import defpackage.rk9;
import defpackage.rl1;
import defpackage.rvf;
import defpackage.rx6;
import defpackage.sd8;
import defpackage.sl6;
import defpackage.sp;
import defpackage.sq;
import defpackage.sv3;
import defpackage.sv7;
import defpackage.sw3;
import defpackage.swc;
import defpackage.t72;
import defpackage.ta0;
import defpackage.to3;
import defpackage.tp;
import defpackage.tp5;
import defpackage.tq;
import defpackage.twc;
import defpackage.u98;
import defpackage.ua4;
import defpackage.ub3;
import defpackage.un5;
import defpackage.un8;
import defpackage.up;
import defpackage.uvf;
import defpackage.uyb;
import defpackage.uzd;
import defpackage.v6;
import defpackage.v67;
import defpackage.va4;
import defpackage.vcc;
import defpackage.vd0;
import defpackage.vea;
import defpackage.vf9;
import defpackage.vp;
import defpackage.vpf;
import defpackage.vsd;
import defpackage.vu4;
import defpackage.vv7;
import defpackage.vz9;
import defpackage.w0d;
import defpackage.w60;
import defpackage.w79;
import defpackage.w84;
import defpackage.wcc;
import defpackage.wef;
import defpackage.wg9;
import defpackage.wia;
import defpackage.wj9;
import defpackage.wn5;
import defpackage.wo0;
import defpackage.wp;
import defpackage.wq0;
import defpackage.wwg;
import defpackage.x0d;
import defpackage.x16;
import defpackage.x48;
import defpackage.x79;
import defpackage.xj9;
import defpackage.xn5;
import defpackage.xn9;
import defpackage.xp;
import defpackage.xp5;
import defpackage.xq;
import defpackage.y17;
import defpackage.yf9;
import defpackage.yl1;
import defpackage.ynb;
import defpackage.yo;
import defpackage.yp;
import defpackage.z4;
import defpackage.z7c;
import defpackage.z7f;
import defpackage.za6;
import defpackage.zde;
import defpackage.zk8;
import defpackage.zm8;
import defpackage.zn2;
import defpackage.zn5;
import defpackage.zo;
import defpackage.zp;
import defpackage.zq;
import defpackage.zrd;
import defpackage.zse;
import defpackage.zv6;
import defpackage.zvf;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u0003:\u0006Ê\u0002Ë\u0002Ì\u0002J\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b \u0010!R+\u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00103\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR+\u0010I\u001a\u00020C2\u0006\u0010\"\u001a\u00020C8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010$\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010O\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R+\u0010`\u001a\u00020^2\u0006\u0010\"\u001a\u00020^8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010$\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010aR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR \u0010t\u001a\u00020n8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u00102\u001a\u0004\bq\u0010rR \u0010z\u001a\b\u0012\u0004\u0012\u00020n0u8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001b\u0010\u0080\u0001\u001a\u00020{8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0094\u0001\u001a\u00030\u008f\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R3\u0010¡\u0001\u001a\u00030\u009b\u00012\u0007\u0010\"\u001a\u00030\u009b\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009c\u0001\u0010$\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010¦\u0001\u001a\u00030¢\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010e\u001a\u0006\b¤\u0001\u0010¥\u0001R\"\u0010¬\u0001\u001a\u0005\u0018\u00010§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\"\u0010²\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R \u0010¸\u0001\u001a\u00030³\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R'\u0010½\u0001\u001a\u00020^8V@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\b»\u0001\u0010a\"\u0005\b¼\u0001\u0010cR/\u0010Ä\u0001\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¾\u0001\u0010¿\u0001\u0012\u0005\bÃ\u0001\u00102\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0005\bÂ\u0001\u0010\u0014R \u0010É\u0001\u001a\u00030Å\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bÆ\u0001\u0010$\u001a\u0006\bÇ\u0001\u0010È\u0001R3\u0010Ð\u0001\u001a\u00030Ê\u00012\u0007\u0010\"\u001a\u00030Ê\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bË\u0001\u0010$\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R \u0010Ö\u0001\u001a\u00030Ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001RD\u0010à\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ø\u0001\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u00120×\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÙ\u0001\u0010Ú\u0001\u0012\u0005\bß\u0001\u00102\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R'\u0010ä\u0001\u001a\u00020^8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bá\u0001\u0010º\u0001\u001a\u0005\bâ\u0001\u0010a\"\u0005\bã\u0001\u0010cR \u0010ê\u0001\u001a\u00030å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R'\u0010í\u0001\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bë\u0001\u0010&\"\u0005\bì\u0001\u0010(R\u0018\u0010ñ\u0001\u001a\u00030î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0017\u0010ô\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010ø\u0001\u001a\u00030õ\u00018F¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u001f\u0010ý\u0001\u001a\u00030ù\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bü\u0001\u00102\u001a\u0006\bú\u0001\u0010û\u0001R\u0018\u0010\u0081\u0002\u001a\u00030þ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0018\u0010\u0085\u0002\u001a\u00030\u0082\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0005\b\u008a\u0002\u0010\u0018R\u0018\u0010\u008e\u0002\u001a\u00030\u008b\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0018\u0010\u0092\u0002\u001a\u00030\u008f\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u0093\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0097\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0017\u0010\u009c\u0002\u001a\u00020\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010Á\u0001R\u0016\u0010\u009e\u0002\u001a\u00020^8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0002\u0010aR\u001f\u0010£\u0002\u001a\u00030\u009f\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¢\u0002\u00102\u001a\u0006\b \u0002\u0010¡\u0002R\u0018\u0010§\u0002\u001a\u00030¤\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010«\u0002\u001a\u00030¨\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R\u001f\u0010°\u0002\u001a\u00030¬\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b¯\u0002\u00102\u001a\u0006\b\u00ad\u0002\u0010®\u0002R\u0018\u0010´\u0002\u001a\u00030±\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010³\u0002R\u0018\u0010¸\u0002\u001a\u00030µ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¶\u0002\u0010·\u0002R\u0018\u0010¼\u0002\u001a\u00030¹\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0002\u0010»\u0002R\u0013\u0010¾\u0002\u001a\u00020^8F¢\u0006\u0007\u001a\u0005\b½\u0002\u0010aR\u0019\u0010Á\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R\u0018\u0010Å\u0002\u001a\u00030Â\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ä\u0002R\u0018\u0010É\u0002\u001a\u00030Æ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010È\u0002¨\u0006Í\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lqs9;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Lwn5;", "", "getImportantForAutofill", "()I", "Lhkb;", "getEmbeddedViewFocusRect", "()Lhkb;", "", "intervalMillis", "Lwef;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lj6c;", "handler", "setUncaughtExceptionHandler", "(Lj6c;)V", "Lkotlin/Function1;", "Lqf2;", "callback", "setOnReadyForComposition", "(La26;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "<set-?>", "a", "Le89;", "get_composeViewContext", "()Lqf2;", "set_composeViewContext", "(Lqf2;)V", "_composeViewContext", "Ly17;", "d", "Ly17;", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui", "()Ly17;", "setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui", "(Ly17;)V", "getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations", "()V", "primaryDirectionalMotionAxisOverride", "Ld58;", "e", "Ld58;", "getFrameEndScheduler$ui", "()Ld58;", "setFrameEndScheduler$ui", "(Ld58;)V", "frameEndScheduler", "Lozb;", "value", "v", "Lozb;", "getRetainedValuesStore", "()Lozb;", "retainedValuesStore", "Lsw3;", "y", "getDensity", "()Lsw3;", "setDensity", "(Lsw3;)V", "density", "Lzn5;", "E0", "Lzn5;", "getFocusOwner", "()Lzn5;", "focusOwner", "Lpv2;", "F0", "Lpv2;", "getCoroutineContext", "()Lpv2;", "setCoroutineContext", "(Lpv2;)V", "coroutineContext", "Lpr;", "G0", "Lpr;", "getDragAndDropManager", "()Lpr;", "dragAndDropManager", "", "H0", "isAttached", "()Z", "setAttached", "(Z)V", "I0", "Lh0e;", "getDerivedIsAttached", "derivedIsAttached", "La57;", "J0", "La57;", "getInsetsListener", "()La57;", "insetsListener", "Landroidx/compose/ui/node/LayoutNode;", "K0", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "getRoot$annotations", "root", "Lq69;", "L0", "Lq69;", "getLayoutNodes", "()Lq69;", "layoutNodes", "Ljkb;", "M0", "Ljkb;", "getRectManager", "()Ljkb;", "rectManager", "Lbxc;", "N0", "Lbxc;", "getSemanticsOwner", "()Lbxc;", "semanticsOwner", "Lzq;", "P0", "Lzq;", "getContentCaptureManager$ui", "()Lzq;", "setContentCaptureManager$ui", "(Lzq;)V", "contentCaptureManager", "Lie6;", "Q0", "Lie6;", "getGraphicsContext", "()Lie6;", "graphicsContext", "Lwq0;", "R0", "Lwq0;", "getAutofillTree", "()Lwq0;", "autofillTree", "Landroid/content/res/Configuration;", "Y0", "getConfiguration", "()Landroid/content/res/Configuration;", "setConfiguration", "(Landroid/content/res/Configuration;)V", "configuration", "Lsd8;", "Z0", "getLocaleList", "()Lsd8;", "localeList", "Lyo;", "a1", "Lyo;", "getAutofill", "()Lyo;", "autofill", "Lzo;", "b1", "Lzo;", "getAutofillManager", "()Lzo;", "autofillManager", "Lgw9;", "d1", "Lgw9;", "getSnapshotObserver", "()Lgw9;", "snapshotObserver", "e1", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "p1", "J", "getLastMatrixRecalculationAnimationTime$ui", "()J", "setLastMatrixRecalculationAnimationTime$ui", "getLastMatrixRecalculationAnimationTime$ui$annotations", "lastMatrixRecalculationAnimationTime", "Lxp5;", "x1", "getFontFamilyResolver", "()Lxp5;", "fontFamilyResolver", "Lcv7;", "y1", "getLayoutDirection", "()Lcv7;", "setLayoutDirection", "(Lcv7;)V", "layoutDirection", "Lo09;", "A1", "Lo09;", "getModifierLocalManager", "()Lo09;", "modifierLocalManager", "Lkotlin/Function2;", "Lmn5;", "N1", "Ll26;", "getPlayNavigationSoundEffect$ui", "()Ll26;", "setPlayNavigationSoundEffect$ui", "(Ll26;)V", "getPlayNavigationSoundEffect$ui$annotations", "playNavigationSoundEffect", "S1", "getComposeViewContextIncrementedDuringInit$ui", "setComposeViewContextIncrementedDuringInit$ui", "composeViewContextIncrementedDuringInit", "Lnia;", "W1", "Lnia;", "getPointerIconService", "()Lnia;", "pointerIconService", "getComposeViewContext", "setComposeViewContext", "composeViewContext", "Lvv7;", "getSharedDrawScope", "()Lvv7;", "sharedDrawScope", "getView", "()Landroid/view/View;", "view", "Lua4;", "getSavedStateRegistry", "()Lua4;", "savedStateRegistry", "Le7g;", "getWindowInfo", "()Le7g;", "getWindowInfo$annotations", "windowInfo", "Lrvf;", "getViewConfiguration", "()Lrvf;", "viewConfiguration", "Lk6c;", "getRootForTest", "()Lk6c;", "rootForTest", "uncaughtExceptionHandler", "Lj6c;", "getUncaughtExceptionHandler$ui", "()Lj6c;", "setUncaughtExceptionHandler$ui", "Ln6;", "getAccessibilityManager", "()Ln6;", "accessibilityManager", "Ld52;", "getClipboardManager", "()Ld52;", "clipboardManager", "Lc52;", "getClipboard", "()Lc52;", "clipboard", "Lex;", "getAndroidViewsHandler$ui", "()Lex;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lgte;", "getTextInputService", "()Lgte;", "getTextInputService$annotations", "textInputService", "Lvsd;", "getSoftwareKeyboardController", "()Lvsd;", "softwareKeyboardController", "Lbea;", "getPlacementScope", "()Lbea;", "placementScope", "Ltp5;", "getFontLoader", "()Ltp5;", "getFontLoader$annotations", "fontLoader", "Leh6;", "getHapticFeedBack", "()Leh6;", "hapticFeedBack", "Lo47;", "getInputModeManager", "()Lo47;", "inputModeManager", "Lque;", "getTextToolbar", "()Lque;", "textToolbar", "getScrollCaptureInProgress", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "Lyl1;", "getCanvasHolder", "()Lyl1;", "canvasHolder", "Lite;", "getLegacyTextInputServiceAndroid", "()Lite;", "legacyTextInputServiceAndroid", "zp", "ynb", "aq", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class AndroidComposeView extends ViewGroup implements Owner, k6c, DefaultLifecycleObserver, qs9, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, wn5 {
    public static Class X1;
    public static Method Y1;
    public static Method Z1;
    public static final i79 a2 = new i79();
    public static ni b2;
    public static Method c2;
    public static Method d2;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    public final o09 modifierLocalManager;
    public av4 B1;
    public MotionEvent C1;
    public long D1;
    public final bo5 E0;
    public final lqb E1;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public pv2 coroutineContext;
    public final i79 F1;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public final pr dragAndDropManager;
    public float G1;
    public final vz9 H0;
    public float H1;
    public final mx3 I0;
    public float I1;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public final a57 insetsListener;
    public float J1;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public final LayoutNode root;
    public final wwg K1;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public final q69 layoutNodes;
    public final yp L1;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public final jkb rectManager;
    public boolean M1;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public final bxc semanticsOwner;

    /* JADX INFO: renamed from: N1, reason: from kotlin metadata */
    public l26 playNavigationSoundEffect;
    public final lq O0;
    public final j27 O1;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public zq contentCaptureManager;
    public final tp P1;
    public final is Q0;
    public final tp Q1;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final wq0 autofillTree;
    public boolean R1;
    public final i79 S0;

    /* JADX INFO: renamed from: S1, reason: from kotlin metadata */
    public boolean composeViewContextIncrementedDuringInit;
    public i79 T0;
    public boolean T1;
    public boolean U0;
    public final qm2 U1;
    public boolean V0;
    public View V1;
    public final n39 W0;
    public final dq W1;
    public final kv X0;
    public final vz9 Y0;
    public final mx3 Z0;
    public final vz9 a;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public final yo autofill;
    public long b;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public final zo autofillManager;
    public final boolean c;
    public boolean c1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public y17 primaryDirectionalMotionAxisOverride;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public final gw9 snapshotObserver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public d58 frameEndScheduler;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public e58 f;
    public ex f1;
    public ua4 g;
    public kl2 g1;
    public boolean h1;
    public final ld5 i1;
    public long j1;
    public final int[] k1;
    public final float[] l1;
    public final Matrix m1;
    public final float[] n1;
    public final float[] o1;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;
    public boolean q1;
    public long r1;
    public a26 s1;
    public ite t1;
    public gte u1;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ozb retainedValuesStore;
    public final AtomicReference v1;
    public final ad0 w;
    public dw3 w1;
    public final yp x;

    /* JADX INFO: renamed from: x1, reason: from kotlin metadata */
    public final e89 fontFamilyResolver;
    public final vz9 y;
    public final vz9 y1;
    public final View z;
    public o47 z1;

    public AndroidComposeView(Context context, qf2 qf2Var) {
        cv7 cv7Var;
        super(context);
        this.a = q1c.f(qf2Var);
        this.b = 9205357640488583168L;
        int i = 1;
        this.c = true;
        this.retainedValuesStore = qk6.E0;
        this.w = new ad0();
        int i2 = 0;
        this.x = new yp(this, i2);
        this.y = new vz9(z7f.b(context), hj6.X0);
        this.E0 = new bo5(this, this);
        this.coroutineContext = qf2Var.c().k();
        this.dragAndDropManager = new pr();
        this.H0 = q1c.f(Boolean.FALSE);
        int i3 = 2;
        this.I0 = zrd.b(new tp(this, i3));
        this.insetsListener = new a57();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.B0(l6c.c);
        layoutNode.y0(getDensity());
        layoutNode.D0(getViewConfiguration());
        layoutNode.C0(new eq(this).D(((bo5) getFocusOwner()).e).D(getDragAndDropManager().c));
        this.root = layoutNode;
        q69 q69Var = v67.a;
        this.layoutNodes = new q69();
        this.rectManager = new jkb(m3getLayoutNodes(), this);
        this.semanticsOwner = new bxc(getRoot(), new vu4(), m3getLayoutNodes());
        lq lqVar = new lq(this);
        this.O0 = lqVar;
        this.contentCaptureManager = new zq(this, new hl(0, this, tq.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 1));
        this.Q0 = new is(this);
        this.autofillTree = new wq0();
        this.S0 = new i79();
        this.W0 = new n39();
        LayoutNode root = getRoot();
        kv kvVar = new kv();
        kvVar.b = root;
        kvVar.c = new pl6((c47) root.V0.d);
        kvVar.d = new mjg(28);
        kvVar.e = new sl6();
        this.X0 = kvVar;
        this.Y0 = q1c.f(new Configuration(context.getResources().getConfiguration()));
        this.Z0 = zrd.b(new tp(this, 3));
        this.autofill = new yo(this, getAutofillTree());
        this.autofillManager = new zo(new vea(i2, context), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.snapshotObserver = new gw9(new sp(this, i));
        this.i1 = new ld5(getRoot());
        this.j1 = 9223372034707292159L;
        this.k1 = new int[]{0, 0};
        this.l1 = zm8.a();
        this.m1 = new Matrix();
        this.n1 = zm8.a();
        this.o1 = zm8.a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.r1 = 9187343241974906880L;
        this.v1 = new AtomicReference(null);
        this.fontFamilyResolver = qf2Var.p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = un5.a;
        cv7 cv7Var2 = cv7.a;
        if (layoutDirection != 0) {
            cv7Var = layoutDirection != 1 ? null : cv7.b;
        } else {
            cv7Var = cv7Var2;
        }
        this.y1 = q1c.f(cv7Var != null ? cv7Var : cv7Var2);
        this.modifierLocalManager = new o09(this);
        this.E1 = new lqb(18);
        this.F1 = new i79();
        this.G1 = Float.NaN;
        this.H1 = Float.NaN;
        this.I1 = Float.NaN;
        this.J1 = Float.NaN;
        int i4 = 4;
        this.K1 = new wwg(i4, this);
        this.L1 = new yp(this, i);
        this.playNavigationSoundEffect = new zp(i2, this);
        sp spVar = new sp(this, i3);
        j27 j27Var = new j27();
        j27Var.c = spVar;
        j27Var.b = 0;
        j27Var.d = new GestureDetector(context, new i27(j27Var));
        this.O1 = j27Var;
        this.P1 = new tp(this, i4);
        this.Q1 = new tp(this, i2);
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        sq.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        nvf.j(this, lqVar);
        setOnDragListener(getDragAndDropManager());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            nq.a.a(this);
        }
        if (l()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.z = view;
            addView(view, -1);
        }
        this.U1 = i5 >= 31 ? new qm2(3) : null;
        this.W1 = new dq(this);
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt);
            }
        }
    }

    public static long d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        r3.l();
        return 0L;
    }

    public static final boolean f(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final yl1 getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.I0.getValue()).booleanValue();
    }

    private final ite getLegacyTextInputServiceAndroid() {
        ite iteVar = this.t1;
        if (iteVar != null) {
            return iteVar;
        }
        ite iteVar2 = new ite(getView(), this, new vp(0, this));
        this.t1 = iteVar2;
        return iteVar2;
    }

    private final qf2 get_composeViewContext() {
        return (qf2) this.a.getValue();
    }

    public static void j(LayoutNode layoutNode) {
        layoutNode.Q();
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            j((LayoutNode) objArr[i2]);
        }
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean m(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !o39.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.H0.setValue(Boolean.valueOf(z));
    }

    private void setDensity(sw3 sw3Var) {
        this.y.setValue(sw3Var);
    }

    private void setLayoutDirection(cv7 cv7Var) {
        this.y1.setValue(cv7Var);
    }

    private final void set_composeViewContext(qf2 qf2Var) {
        this.a.setValue(qf2Var);
    }

    public final void A() {
        if (this.q1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            C();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.k1;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.r1 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void B(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        C();
        float x = motionEvent.getX();
        long jB = zm8.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.n1);
        this.r1 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public final void C() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.n1;
        int[] iArr = this.k1;
        if (i >= 29) {
            a91.a.a(this, fArr, this.m1, iArr);
        } else {
            zm8.d(fArr);
            tq.Q(this, fArr, this.l1, iArr);
        }
        if9.A(fArr, this.o1);
    }

    public final boolean D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(x16 x16Var) {
        ad0 ad0Var = this.w;
        boolean zIsEmpty = ad0Var.isEmpty();
        ad0Var.addLast(x16Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.x);
            } else {
                qc0.j("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void F(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.B() == sv7.a) {
                if (!this.h1) {
                    LayoutNode layoutNodeF = layoutNode.F();
                    if (layoutNodeF == null) {
                        break;
                    }
                    long j = ((c47) layoutNodeF.V0.d).d;
                    if (kl2.f(j) && kl2.e(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.F();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        A();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.r1 >> 32));
        return zm8.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.r1 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.o1);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.R1) {
            this.R1 = false;
            b28 b28Var = getComposeViewContext().t;
            f7g.a.setValue(new wia(motionEvent.getMetaState()));
        }
        n39 n39Var = this.W0;
        w84 w84VarC = n39Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        kv kvVar = this.X0;
        if (w84VarC == null) {
            if (!kvVar.a) {
                ((gg8) ((mjg) kvVar.d).a).a();
                ((pl6) kvVar.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) w84VarC.b;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = arrayList.get(size);
            if (((qia) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        qia qiaVar = (qia) obj;
        if (qiaVar != null) {
            this.b = qiaVar.d;
        }
        int iE = kvVar.e(w84VarC, this, n(motionEvent));
        w84VarC.c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iE & 1) != 0) {
            return iE;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        n39Var.c.delete(pointerId);
        n39Var.b.delete(pointerId);
        return iE;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jQ = q((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        w84 w84VarC = this.W0.c(motionEventObtain, this);
        w84VarC.getClass();
        this.X0.e(w84VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void J(l26 l26Var, zn2 zn2Var) {
        a aVar;
        if (zn2Var instanceof a) {
            aVar = (a) zn2Var;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, zn2Var);
            }
        } else {
            aVar = new a(this, zn2Var);
        }
        Object obj = aVar.result;
        int i2 = aVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            sp spVar = new sp(this, 0);
            aVar.label = 1;
            if (jgb.O(new x0d(spVar, this.v1, l26Var, null), aVar) == bw2.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            jzb.q(obj);
        }
        oo3.f();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (pa7.t(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(z7f.b(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void L() {
        boolean z;
        int i;
        int[] iArr = this.k1;
        getLocationOnScreen(iArr);
        long j = this.j1;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.lastMatrixRecalculationAnimationTime >= 0) {
            z = false;
        } else {
            this.j1 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                p89 p89VarL = getRoot().L();
                Object[] objArr = p89VarL.a;
                int i5 = p89VarL.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((LayoutNode) objArr[i6]).z().B0();
                }
                z = true;
            }
        }
        A();
        View rootView = this.V1;
        if (rootView == null) {
            rootView = getRootView();
            this.V1 = rootView;
        }
        jkb rectManager = getRectManager();
        long j2 = this.j1;
        long jR = qn4.R(this.r1);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.n1;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        u98 u98Var = rectManager.d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.g = u98Var.b(j2, jR, fArr, width, height) || rectManager.g;
        this.i1.d(z);
        getRectManager().a();
    }

    public final void M(float f) {
        if (l()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.G1) || f > this.G1) {
                    this.G1 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.H1) || f < this.H1) {
                    this.H1 = f;
                }
            }
        }
    }

    @Override // defpackage.wn5
    public final void a(oo5 oo5Var, oo5 oo5Var2) {
        wo0 wo0Var;
        boolean z;
        wo0 wo0Var2;
        boolean z2;
        if (oo5Var != null) {
            oo5 oo5Var3 = oo5Var;
            if (!oo5Var3.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09 i09Var = oo5Var3.a;
            LayoutNode layoutNodeS0 = vd0.s0(oo5Var);
            x79 x79Var = null;
            ArrayList arrayList = null;
            while (layoutNodeS0 != null) {
                if ((((i09) layoutNodeS0.V0.g).d & 2097152) != 0) {
                    while (i09Var != null) {
                        if ((i09Var.c & 2097152) != 0) {
                            i09 i09VarM0 = i09Var;
                            p89 p89Var = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof h27) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(i09VarM0);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (i09VarM0.c & 2097152) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i = 0;
                                    for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                        if ((i09Var2.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                i09VarM0 = i09Var2;
                                            } else {
                                                if (p89Var == null) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var.b(i09Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var);
                            }
                        }
                        i09Var = i09Var.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var = (layoutNodeS0 == null || (wo0Var2 = layoutNodeS0.V0) == null) ? null : (zde) wo0Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (oo5Var2 != null) {
                if (!oo5Var2.a.Y) {
                    i37.c("visitAncestors called on an unattached node");
                }
                i09 i09Var3 = oo5Var2.a;
                LayoutNode layoutNodeS1 = vd0.s0(oo5Var2);
                x79 x79Var2 = null;
                while (layoutNodeS1 != null) {
                    if ((((i09) layoutNodeS1.V0.g).d & 2097152) != 0) {
                        while (i09Var3 != null) {
                            if ((i09Var3.c & 2097152) != 0) {
                                i09 i09VarM1 = i09Var3;
                                p89 p89Var2 = null;
                                while (i09VarM1 != null) {
                                    if (i09VarM1 instanceof h27) {
                                        if (x79Var2 == null) {
                                            x79 x79Var3 = mec.a;
                                            x79Var2 = new x79();
                                        }
                                        x79Var2.e(i09VarM1);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (i09VarM1.c & 2097152) != 0 && (i09VarM1 instanceof sv3)) {
                                        int i2 = 0;
                                        for (i09 i09Var4 = ((sv3) i09VarM1).E0; i09Var4 != null; i09Var4 = i09Var4.f) {
                                            if ((i09Var4.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    i09VarM1 = i09Var4;
                                                } else {
                                                    if (p89Var2 == null) {
                                                        p89Var2 = new p89(0, new i09[16]);
                                                    }
                                                    if (i09VarM1 != null) {
                                                        p89Var2.b(i09VarM1);
                                                        i09VarM1 = null;
                                                    }
                                                    p89Var2.b(i09Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    i09VarM1 = vd0.m0(p89Var2);
                                }
                            }
                            i09Var3 = i09Var3.e;
                        }
                    }
                    layoutNodeS1 = layoutNodeS1.F();
                    i09Var3 = (layoutNodeS1 == null || (wo0Var = layoutNodeS1.V0) == null) ? null : (zde) wo0Var.f;
                }
                x79Var = x79Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                h27 h27Var = (h27) arrayList.get(i3);
                if (!(x79Var != null ? x79Var.a(h27Var) : false)) {
                    h27Var.t0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        oo5 oo5Var = ((bo5) getFocusOwner()).c;
        if (!oo5Var.Y) {
            return;
        }
        if (!oo5Var.a.Y) {
            i37.c("visitSubtreeIf called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var = oo5Var.a;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 == null) {
            vd0.H(p89Var, i09Var);
        } else {
            p89Var.b(i09Var2);
        }
        while (true) {
            int i3 = p89Var.c;
            if (i3 == 0) {
                return;
            }
            i09 i09Var3 = (i09) p89Var.k(i3 - 1);
            if ((i09Var3.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                for (i09 i09Var4 = i09Var3; i09Var4 != null && i09Var4.Y; i09Var4 = i09Var4.f) {
                    if ((i09Var4.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        i09 i09VarM0 = i09Var4;
                        p89 p89Var2 = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                oo5 oo5Var2 = (oo5) i09VarM0;
                                if (oo5Var2.Y && oo5Var2.n1().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    oo5 oo5Var3 = ((bo5) getFocusOwner()).c;
                                    if (oo5Var3.Y) {
                                        if (!oo5Var3.a.Y) {
                                            i37.c("visitSubtreeIf called on an unattached node");
                                        }
                                        p89 p89Var3 = new p89(0, new i09[16]);
                                        i09 i09Var5 = oo5Var3.a;
                                        i09 i09Var6 = i09Var5.f;
                                        if (i09Var6 == null) {
                                            vd0.H(p89Var3, i09Var5);
                                        } else {
                                            p89Var3.b(i09Var6);
                                        }
                                        while (true) {
                                            int i4 = p89Var3.c;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            i09 i09Var7 = (i09) p89Var3.k(i4 - 1);
                                            if ((i09Var7.d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                for (i09 i09Var8 = i09Var7; i09Var8 != null && i09Var8.Y; i09Var8 = i09Var8.f) {
                                                    if ((i09Var8.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                        i09 i09VarM1 = i09Var8;
                                                        p89 p89Var4 = null;
                                                        while (i09VarM1 != null) {
                                                            if (i09VarM1 instanceof oo5) {
                                                                oo5 oo5Var4 = (oo5) i09VarM1;
                                                                if (oo5Var4.Y) {
                                                                    do5 do5VarN1 = oo5Var4.n1();
                                                                    if (oo5Var4.Y && !oo5Var4.Z && do5VarN1.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((i09VarM1.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM1 instanceof sv3)) {
                                                                int i5 = 0;
                                                                for (i09 i09Var9 = ((sv3) i09VarM1).E0; i09Var9 != null; i09Var9 = i09Var9.f) {
                                                                    if ((i09Var9.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            i09VarM1 = i09Var9;
                                                                        } else {
                                                                            if (p89Var4 == null) {
                                                                                p89Var4 = new p89(0, new i09[16]);
                                                                            }
                                                                            if (i09VarM1 != null) {
                                                                                p89Var4.b(i09VarM1);
                                                                                i09VarM1 = null;
                                                                            }
                                                                            p89Var4.b(i09Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            i09VarM1 = vd0.m0(p89Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            vd0.H(p89Var3, i09Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i6 = 0;
                                for (i09 i09Var10 = ((sv3) i09VarM0).E0; i09Var10 != null; i09Var10 = i09Var10.f) {
                                    if ((i09Var10.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            i09VarM0 = i09Var10;
                                        } else {
                                            if (p89Var2 == null) {
                                                p89Var2 = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var2.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var2.b(i09Var10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var2);
                        }
                    }
                }
            }
            vd0.H(p89Var, i09Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        twc twcVarH;
        a26 a26Var;
        a26 a26Var2;
        zo autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                LayoutNode layoutNode = (LayoutNode) autofillManager.b.c.b(iKeyAt);
                if (layoutNode != null && (twcVarH = layoutNode.H()) != null) {
                    w79 w79Var = twcVarH.a;
                    Object objG = w79Var.g(swc.g);
                    if (objG == null) {
                        objG = null;
                    }
                    f6 f6Var = (f6) objG;
                    if (f6Var != null && (a26Var2 = (a26) f6Var.b) != null) {
                    }
                    Object objG2 = w79Var.g(swc.h);
                    f6 f6Var2 = (f6) (objG2 != null ? objG2 : null);
                    if (f6Var2 != null && (a26Var = (a26) f6Var2.b) != null) {
                    }
                }
            }
        }
        yo autofill = getAutofill();
        if (autofill != null) {
            wq0 wq0Var = autofill.b;
            if (wq0Var.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (wq0Var.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        r3.f();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new wg9("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new wg9("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new wg9("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        lq lqVar = this.O0;
        if (pa7.t(str, lqVar.S0)) {
            int iD2 = lqVar.Q0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!pa7.t(str, lqVar.T0) || (iD = lqVar.R0.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.O0.m(i, this.b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.O0.m(i, this.b, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i79 i79Var = this.S0;
        if (!isAttachedToWindow()) {
            j(getRoot());
        }
        r(true);
        qrd.h().m();
        this.U0 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            yl1 canvasHolder = getCanvasHolder();
            lp lpVar = canvasHolder.a;
            Canvas canvas2 = lpVar.a;
            lpVar.a = canvas;
            getRoot().k(lpVar, null);
            canvasHolder.a.a = canvas2;
            if (i79Var.e()) {
                int i = i79Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ne6) ((ew9) i79Var.b(i2))).g();
                }
            }
            int i3 = zvf.a;
            i79Var.k();
            this.U0 = false;
            Trace.endSection();
            i79 i79Var2 = this.T0;
            if (i79Var2 != null) {
                i79Var.i(i79Var2);
                i79Var2.k();
            }
            if (l()) {
                if (Float.compare(this.G1, this.I1) != 0) {
                    float f = this.G1;
                    this.I1 = f;
                    w60.a(this, f);
                }
                View view = this.z;
                if (view != null) {
                    if (Float.compare(this.H1, this.J1) != 0) {
                        float f2 = this.H1;
                        this.J1 = f2;
                        w60.a(view, f2);
                    }
                    if (!Float.isNaN(this.H1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.G1 = Float.NaN;
                this.H1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        if (o(r24) == false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((bo5) getFocusOwner()).e(keyEvent, new v6(4, this, keyEvent));
        }
        b28 b28Var = getComposeViewContext().t;
        f7g.a.setValue(new wia(keyEvent.getMetaState()));
        return ((bo5) getFocusOwner()).e(keyEvent, new ead(2)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        wo0 wo0Var;
        if (isFocused()) {
            bo5 bo5Var = (bo5) getFocusOwner();
            if (bo5Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                oo5 oo5VarX = vpf.x(bo5Var.c);
                if (oo5VarX != null) {
                    if (!oo5VarX.a.Y) {
                        i37.c("visitAncestors called on an unattached node");
                    }
                    i09 i09Var = oo5VarX.a;
                    LayoutNode layoutNodeS0 = vd0.s0(oo5VarX);
                    while (layoutNodeS0 != null) {
                        if ((((i09) layoutNodeS0.V0.g).d & 131072) != 0) {
                            while (i09Var != null) {
                                if ((i09Var.c & 131072) != 0) {
                                    i09 i09VarM0 = i09Var;
                                    p89 p89Var = null;
                                    while (i09VarM0 != null) {
                                        if ((i09VarM0.c & 131072) != 0 && (i09VarM0 instanceof sv3)) {
                                            int i = 0;
                                            for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                                if ((i09Var2.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        i09VarM0 = i09Var2;
                                                    } else {
                                                        if (p89Var == null) {
                                                            p89Var = new p89(0, new i09[16]);
                                                        }
                                                        if (i09VarM0 != null) {
                                                            p89Var.b(i09VarM0);
                                                            i09VarM0 = null;
                                                        }
                                                        p89Var.b(i09Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        i09VarM0 = vd0.m0(p89Var);
                                    }
                                }
                                i09Var = i09Var.e;
                            }
                        }
                        layoutNodeS0 = layoutNodeS0.F();
                        i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.T1 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.T1 = false;
            z(viewStructure);
        } catch (Throwable th) {
            this.T1 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            mq.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object km0Var;
        oo5 oo5VarG;
        if (this.M1) {
            yp ypVar = this.L1;
            removeCallbacks(ypVar);
            MotionEvent motionEvent2 = this.C1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.M1 = false;
            } else {
                ypVar.run();
            }
        }
        if (!m(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || o(motionEvent))) {
            int i = i(motionEvent);
            int i2 = 1;
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (km0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    km0Var = new km0(i2);
                }
                if (km0Var.equals(new km0(i2)) && (oo5VarG = ((bo5) getFocusOwner()).g()) != null) {
                    yf9 yf9VarR0 = vd0.r0(oo5VarG);
                    if (!vd0.S(yf9VarR0).M(yf9VarR0, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        xn5.a(getFocusOwner());
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final ew9 e(l26 l26Var, vf9 vf9Var, ke6 ke6Var) {
        p89 p89Var;
        Reference referencePoll;
        Object obj;
        if (ke6Var != null) {
            return new ne6(ke6Var, null, this, l26Var, vf9Var);
        }
        do {
            lqb lqbVar = this.E1;
            ReferenceQueue referenceQueue = (ReferenceQueue) lqbVar.c;
            p89Var = (p89) lqbVar.b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                p89Var.j(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = p89Var.c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) p89Var.k(i - 1)).get();
        } while (obj == null);
        ew9 ew9Var = (ew9) obj;
        if (ew9Var == null) {
            return new ne6(getGraphicsContext().c(), getGraphicsContext(), this, l26Var, vf9Var);
        }
        ne6 ne6Var = (ne6) ew9Var;
        ie6 ie6Var = ne6Var.b;
        if (ie6Var == null) {
            throw kv2.d("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!ne6Var.a.s) {
            i37.a("layer should have been released before reuse");
        }
        ne6Var.a = ie6Var.c();
        ne6Var.g = false;
        ne6Var.d = l26Var;
        ne6Var.e = vf9Var;
        ne6Var.F0 = false;
        ne6Var.G0 = false;
        ne6Var.H0 = true;
        zm8.d(ne6Var.v);
        float[] fArr = ne6Var.w;
        if (fArr != null) {
            zm8.d(fArr);
        }
        ne6Var.Z = r2f.b;
        ne6Var.I0 = false;
        ne6Var.f = 9223372034707292159L;
        ne6Var.E0 = null;
        ne6Var.Y = 0;
        return ew9Var;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return ynb.I(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        hkb hkbVarA;
        if (view == null || this.i1.b) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !tq.q(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            oo5 oo5VarX = vpf.x(((bo5) getFocusOwner()).c);
            hkbVarA = oo5VarX != null ? vpf.z(oo5VarX) : null;
            if (hkbVarA == null) {
                hkbVarA = un5.a(view, this);
            }
        } else {
            hkbVarA = un5.a(view, this);
        }
        mn5 mn5VarD = un5.d(i);
        int i2 = mn5VarD != null ? mn5VarD.a : 6;
        mmb mmbVar = new mmb();
        if (((bo5) getFocusOwner()).f(i2, hkbVarA, new up(mmbVar, 0)) == null) {
            return view;
        }
        Object obj = mmbVar.element;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || uyb.u(vpf.z((oo5) obj), un5.a(viewFindNextFocus, this), hkbVarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final void g(LayoutNode layoutNode, boolean z) {
        this.i1.i(layoutNode, z);
    }

    @Override // androidx.compose.ui.node.Owner
    public n6 getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final ex getAndroidViewsHandler$ui() {
        if (this.f1 == null) {
            ex exVar = new ex(getContext());
            this.f1 = exVar;
            addView(exVar, -1);
            requestLayout();
        }
        ex exVar2 = this.f1;
        exVar2.getClass();
        return exVar2;
    }

    @Override // androidx.compose.ui.node.Owner
    public wq0 getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.node.Owner
    public c52 getClipboard() {
        return getComposeViewContext().n;
    }

    @Override // androidx.compose.ui.node.Owner
    public d52 getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final qf2 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX INFO: renamed from: getComposeViewContextIncrementedDuringInit$ui, reason: from getter */
    public final boolean getComposeViewContextIncrementedDuringInit() {
        return this.composeViewContextIncrementedDuringInit;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.Y0.getValue();
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui, reason: from getter */
    public final zq getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public pv2 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public sw3 getDensity() {
        return (sw3) this.y.getValue();
    }

    public hkb getEmbeddedViewFocusRect() {
        if (isFocused()) {
            oo5 oo5VarX = vpf.x(((bo5) getFocusOwner()).c);
            if (oo5VarX != null) {
                return vpf.z(oo5VarX);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return un5.a(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public zn5 getFocusOwner() {
        return this.E0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        hkb embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (pa7.t(((bo5) getFocusOwner()).f(6, null, new z4(20)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public xp5 getFontFamilyResolver() {
        return (xp5) this.fontFamilyResolver.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public tp5 getFontLoader() {
        return getComposeViewContext().o;
    }

    /* JADX INFO: renamed from: getFrameEndScheduler$ui, reason: from getter */
    public final d58 getFrameEndScheduler() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public ie6 getGraphicsContext() {
        return this.Q0;
    }

    @Override // androidx.compose.ui.node.Owner
    public eh6 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((ta0) this.i1.e).J() || !this.w.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public o47 getInputModeManager() {
        o47 o47Var = this.z1;
        if (o47Var == null) {
            o47Var = new o47(isInTouchMode() ? 1 : 2);
            this.z1 = o47Var;
        }
        return o47Var;
    }

    public final a57 getInsetsListener() {
        return this.insetsListener;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public cv7 getLayoutDirection() {
        return (cv7) this.y1.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public sd8 getLocaleList() {
        return (sd8) this.Z0.getValue();
    }

    public long getMeasureIteration() {
        if (this.i1.b) {
            return 1L;
        }
        i37.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    @Override // androidx.compose.ui.node.Owner
    public o09 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public bea getPlacementScope() {
        q4a q4aVar = dea.a;
        return new mg8(1, this);
    }

    /* JADX INFO: renamed from: getPlayNavigationSoundEffect$ui, reason: from getter */
    public final l26 getPlayNavigationSoundEffect() {
        return this.playNavigationSoundEffect;
    }

    @Override // androidx.compose.ui.node.Owner
    public nia getPointerIconService() {
        return this.W1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name and from getter */
    public final y17 getPrimaryDirectionalMotionAxisOverride() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public jkb getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public ozb getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ua4 getSavedStateRegistry() {
        boolean z;
        ua4 ua4Var = this.g;
        if (ua4Var != null) {
            return ua4Var;
        }
        qf2 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        kdc kdcVar = composeViewContext.e;
        kdcVar.getClass();
        ViewParent parent = getParent();
        parent.getClass();
        View view = (View) parent;
        Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strI = ub3.i("SaveableStateRegistry:", strValueOf);
        vea veaVarH = kdcVar.h();
        Bundle bundleO = veaVarH.o(strI);
        if (bundleO != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleO.keySet()) {
                ArrayList parcelableArrayList = bundleO.getParcelableArrayList(str);
                parcelableArrayList.getClass();
                linkedHashMap.put(str, parcelableArrayList);
            }
        }
        to3 to3Var = new to3(8);
        pr4 pr4Var = wcc.a;
        vcc vccVar = new vcc(linkedHashMap, to3Var);
        int i = 0;
        if (veaVarH.x(strI) != null) {
            z = false;
        } else {
            try {
                z = true;
                veaVarH.A(strI, new pb2(true ? 1 : 0, vccVar));
            } catch (IllegalArgumentException unused) {
                z = false;
            }
        }
        ua4 ua4Var2 = new ua4(vccVar, new va4(z, veaVarH, strI, i));
        this.g = ua4Var2;
        return ua4Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        qm2 qm2Var;
        if (Build.VERSION.SDK_INT >= 31 && (qm2Var = this.U1) != null && ((Boolean) ((vz9) qm2Var.b).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AndroidComposeView) {
                return ((AndroidComposeView) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public bxc getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public vv7 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? p60.a.a(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public gw9 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public vsd getSoftwareKeyboardController() {
        dw3 dw3Var = this.w1;
        if (dw3Var != null) {
            return dw3Var;
        }
        dw3 dw3Var2 = new dw3(getTextInputService());
        this.w1 = dw3Var2;
        return dw3Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public gte getTextInputService() {
        gte gteVar = this.u1;
        if (gteVar != null) {
            return gteVar;
        }
        gte gteVar2 = new gte(getLegacyTextInputServiceAndroid());
        this.u1 = gteVar2;
        return gteVar2;
    }

    @Override // androidx.compose.ui.node.Owner
    public que getTextToolbar() {
        av4 av4Var = this.B1;
        if (av4Var != null) {
            return av4Var;
        }
        av4 av4Var2 = new av4();
        new uzd(4, new p(6, av4Var2));
        this.B1 = av4Var2;
        return av4Var2;
    }

    public final j6c getUncaughtExceptionHandler$ui() {
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public rvf getViewConfiguration() {
        return getComposeViewContext().r;
    }

    @Override // androidx.compose.ui.node.Owner
    public e7g getWindowInfo() {
        return getComposeViewContext().t;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0171 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:40:0x0081, B:41:0x0093, B:50:0x00a6, B:52:0x00ac, B:120:0x0180, B:121:0x018c, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:144:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7 A[Catch: all -> 0x01bf, TryCatch #3 {all -> 0x01bf, blocks: (B:122:0x0190, B:126:0x019c, B:128:0x01a4, B:130:0x01ae, B:129:0x01a7), top: B:149:0x0190 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0113 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:54:0x00b6, B:56:0x00bc, B:64:0x00cd, B:69:0x00da, B:70:0x00dd, B:72:0x00e1, B:74:0x00e7, B:76:0x00eb, B:78:0x00f1, B:81:0x00f9, B:84:0x0101, B:85:0x010d, B:87:0x0113, B:89:0x0119, B:91:0x011f, B:93:0x0125, B:95:0x0129, B:96:0x012d, B:102:0x0140, B:104:0x0144, B:106:0x014b, B:113:0x015c, B:114:0x0166, B:116:0x016e, B:117:0x0171, B:118:0x0178), top: B:146:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    public final int i(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        AndroidComposeView androidComposeView;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iH;
        pl6 pl6Var;
        AndroidComposeView androidComposeView2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        n39 n39Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        pl6 pl6Var2;
        AndroidComposeView androidComposeView3 = this;
        androidComposeView3.removeCallbacks(androidComposeView3.K1);
        try {
            B(motionEvent);
            androidComposeView3.q1 = true;
            androidComposeView3.r(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = androidComposeView3.C1;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                kv kvVar = androidComposeView3.X0;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.C1;
                    if (motionEvent3 != null) {
                        motionEvent4 = androidComposeView.C1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        n39Var = androidComposeView.W0;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = androidComposeView.C1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = androidComposeView.C1;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = androidComposeView.C1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        n39Var.c.delete(pointerId);
                                        n39Var.b.delete(pointerId);
                                    }
                                    pl6Var2 = (pl6) kvVar.c;
                                    if (pl6Var2.d) {
                                        pl6Var2.d = true;
                                    } else {
                                        pl6Var2.g.a.g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        n39Var.c.delete(pointerId);
                                        n39Var.b.delete(pointerId);
                                    }
                                    pl6Var2 = (pl6) kvVar.c;
                                    if (pl6Var2.d) {
                                        pl6Var2.d = true;
                                    } else {
                                        pl6Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = androidComposeView.C1;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = androidComposeView.C1;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = androidComposeView.C1;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    n39Var.c.delete(pointerId);
                                    n39Var.b.delete(pointerId);
                                }
                                pl6Var2 = (pl6) kvVar.c;
                                if (pl6Var2.d) {
                                    pl6Var2.d = true;
                                } else {
                                    pl6Var2.g.a.g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    n39Var.c.delete(pointerId);
                                    n39Var.b.delete(pointerId);
                                }
                                pl6Var2 = (pl6) kvVar.c;
                                if (pl6Var2.d) {
                                    pl6Var2.d = true;
                                } else {
                                    pl6Var2.g.a.g();
                                }
                            }
                        }
                    }
                    androidComposeView.C1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iH = H(motionEvent);
                    Trace.endSection();
                    if ((iH & 4) != 0) {
                        androidComposeView2 = this;
                    } else {
                        pl6Var = (pl6) kvVar.c;
                        if (pl6Var.d) {
                            pl6Var.d = true;
                        } else {
                            pl6Var.g.a.g();
                        }
                        androidComposeView2 = this;
                        androidComposeView2.I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    androidComposeView2.q1 = false;
                    return iH;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!kvVar.a) {
                            ((gg8) ((mjg) kvVar.d).a).a();
                            ((pl6) kvVar.c).c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        androidComposeView3.I(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !n(motionEvent)) {
                        androidComposeView = this;
                    } else {
                        androidComposeView = this;
                        androidComposeView.I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = androidComposeView.C1;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = androidComposeView.C1;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        n39Var = androidComposeView.W0;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = androidComposeView.C1;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = androidComposeView.C1;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = androidComposeView.C1;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        n39Var.c.delete(pointerId);
                                        n39Var.b.delete(pointerId);
                                    }
                                    pl6Var2 = (pl6) kvVar.c;
                                    if (pl6Var2.d) {
                                        pl6Var2.d = true;
                                    } else {
                                        pl6Var2.g.a.g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            n39Var.c.delete(pointerId);
                            n39Var.b.delete(pointerId);
                        }
                    }
                    androidComposeView.C1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        androidComposeView.I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iH = H(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iH & 4) != 0 && z3) {
                            pl6Var = (pl6) kvVar.c;
                            if (pl6Var.d) {
                                pl6Var.d = true;
                            } else {
                                pl6Var.g.a.g();
                            }
                            androidComposeView2 = this;
                            androidComposeView2.I(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            androidComposeView2 = this;
                        }
                        androidComposeView2.q1 = false;
                        return iH;
                    } catch (Throwable th) {
                        th = th;
                        androidComposeView3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        androidComposeView3.q1 = false;
        throw th;
    }

    public final void k(LayoutNode layoutNode) {
        this.i1.x(layoutNode, false);
        p89 p89VarL = layoutNode.L();
        Object[] objArr = p89VarL.a;
        int i = p89VarL.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((LayoutNode) objArr[i2]);
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean o(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.C1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ozb ozbVar;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().W()) {
            getRoot().e(this);
        }
        int i = 1;
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ynb.K());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().e();
        }
        int i2 = 0;
        this.composeViewContextIncrementedDuringInit = false;
        k(getRoot());
        j(getRoot());
        getSnapshotObserver().a.e();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            qc0.p("Expected the view to be attached to window.");
            return;
        }
        outOfFrameExecutor.E(new tp(this, i));
        getComposeViewContext().d();
        qf2 composeViewContext = getComposeViewContext();
        composeViewContext.g();
        pwf pwfVar = composeViewContext.f;
        d58 d58Var = this.frameEndScheduler;
        if (pwfVar == null || d58Var == null) {
            ozbVar = null;
        } else {
            owf owfVarG = pwfVar.g();
            kwf kwfVar = new kwf();
            ey2 ey2Var = ey2.b;
            owfVarG.getClass();
            ey2Var.getClass();
            kxa kxaVar = new kxa(owfVarG, kwfVar, ey2Var);
            em7 em7VarB = job.a.b(f58.class);
            String strG = em7VarB.g();
            if (strG == null) {
                qc0.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            f58 f58Var = (f58) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            q69 q69Var = f58Var.b;
            Object objB = q69Var.b(id);
            if (objB == null) {
                objB = new i79(1);
                q69Var.i(id, objB);
            }
            i79 i79Var = (i79) objB;
            Object[] objArr = i79Var.a;
            int i3 = i79Var.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((e58) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            e58 e58Var = (e58) obj;
            if (e58Var == null) {
                e58Var = new e58();
                i79Var.h(e58Var);
            }
            e58Var.c = true;
            this.f = e58Var;
            ozbVar = e58Var.b;
        }
        if (ozbVar == null) {
            ozbVar = qk6.E0;
        }
        this.retainedValuesStore = ozbVar;
        a26 a26Var = this.s1;
        if (a26Var != null) {
            a26Var.d(getComposeViewContext());
            this.s1 = null;
        }
        h48 h48VarK = getComposeViewContext().d().k();
        h48VarK.a(this);
        h48VarK.a(this.contentCaptureManager);
        getInputModeManager().a.setValue(new m47(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            qq.a.b(this);
        }
        zo autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((bo5) getFocusOwner()).g.h(autofillManager);
            getSemanticsOwner().d.h(autofillManager);
        }
        ((bo5) getFocusOwner()).g.h(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        w0d w0dVar = (w0d) this.v1.get();
        iu iuVar = (iu) (w0dVar != null ? w0dVar.b : null);
        if (iuVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        w0d w0dVar2 = (w0d) iuVar.d.get();
        l47 l47Var = (l47) (w0dVar2 != null ? w0dVar2.b : null);
        return l47Var != null && (l47Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x0190  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        w0d w0dVar = (w0d) this.v1.get();
        iu iuVar = (iu) (w0dVar != null ? w0dVar.b : null);
        int i3 = 12;
        if (iuVar != null) {
            w0d w0dVar2 = (w0d) iuVar.d.get();
            l47 l47Var = (l47) (w0dVar2 != null ? w0dVar2.b : null);
            if (l47Var == null) {
                return null;
            }
            synchronized (l47Var.c) {
                if (l47Var.e) {
                    return null;
                }
                InputConnection inputConnectionA = l47Var.a.a(editorInfo);
                za6 za6Var = new za6(i3, l47Var);
                InputConnection xj9Var = Build.VERSION.SDK_INT >= 34 ? new xj9(inputConnectionA, za6Var) : new wj9(inputConnectionA, za6Var);
                l47Var.d.b(new g0g(xj9Var));
                return xj9Var;
            }
        }
        ite legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        rx6 rx6Var = legacyTextInputServiceAndroid.h;
        zse zseVar = legacyTextInputServiceAndroid.g;
        int i4 = rx6Var.e;
        boolean z = rx6Var.a;
        int i5 = 2;
        int i6 = 4;
        int i7 = 3;
        if (i4 == 1) {
            i = z ? 6 : 0;
        } else if (i4 == 0) {
            i = 1;
        } else if (i4 == 2) {
            i = 2;
        } else if (i4 == 6) {
            i = 5;
        } else if (i4 == 5) {
            i = 7;
        } else if (i4 == 3) {
            i = 3;
        } else if (i4 == 4) {
            i = 4;
        } else {
            if (i4 != 7) {
                qc0.p("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i8 = rx6Var.d;
        if (i8 != 1) {
            if (i8 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i8 == 3) {
                editorInfo.inputType = 2;
                i6 = 2;
            } else {
                if (i8 == 4) {
                    editorInfo.inputType = 3;
                } else {
                    i7 = 17;
                    if (i8 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i8 == 6) {
                        i6 = 33;
                        editorInfo.inputType = 33;
                    } else if (i8 == 7) {
                        i6 = 129;
                        editorInfo.inputType = 129;
                    } else if (i8 == 8) {
                        editorInfo.inputType = 18;
                        i6 = 18;
                    } else if (i8 == 9) {
                        i6 = 8194;
                        editorInfo.inputType = 8194;
                    } else if (i8 == 10) {
                        i6 = 145;
                        editorInfo.inputType = 145;
                    } else if (i8 == 11) {
                        i6 = 113;
                        editorInfo.inputType = 113;
                    } else if (i8 == 12) {
                        i6 = 97;
                        editorInfo.inputType = 97;
                    } else if (i8 == 13) {
                        i6 = 49;
                        editorInfo.inputType = 49;
                    } else if (i8 == 14) {
                        i6 = 65;
                        editorInfo.inputType = 65;
                    } else if (i8 == 15) {
                        i6 = 81;
                        editorInfo.inputType = 81;
                    } else if (i8 == 16) {
                        i6 = 177;
                        editorInfo.inputType = 177;
                    } else if (i8 == 17) {
                        i6 = 193;
                        editorInfo.inputType = 193;
                    } else if (i8 == 18) {
                        editorInfo.inputType = 4;
                    } else {
                        i6 = 20;
                        if (i8 == 19) {
                            editorInfo.inputType = 20;
                        } else if (i8 == 20) {
                            i6 = 36;
                            editorInfo.inputType = 36;
                        } else if (i8 == 21) {
                            i6 = 4098;
                            editorInfo.inputType = 4098;
                        } else if (i8 == 22) {
                            i6 = 12290;
                            editorInfo.inputType = 12290;
                        } else if (i8 == 23) {
                            i6 = 8210;
                            editorInfo.inputType = 8210;
                        } else if (i8 == 24) {
                            i6 = 4114;
                            editorInfo.inputType = 4114;
                        } else {
                            if (i8 != 25) {
                                qc0.p("Invalid Keyboard Type");
                                return null;
                            }
                            i6 = 12306;
                            editorInfo.inputType = 12306;
                        }
                    }
                }
                i6 = i7;
            }
            if (!z && (i6 & 15) == 1) {
                i6 |= 131072;
                editorInfo.inputType = i6;
                if (i4 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i6 & 15) == 1) {
                i2 = rx6Var.b;
                if (i2 == 1) {
                    i6 |= 4096;
                    editorInfo.inputType = i6;
                } else if (i2 == 2) {
                    i6 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    editorInfo.inputType = i6;
                } else if (i2 == 3) {
                    i6 |= 16384;
                    editorInfo.inputType = i6;
                }
                if (rx6Var.c) {
                    editorInfo.inputType = 32768 | i6;
                }
            }
            long j = zseVar.b;
            int i9 = eue.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            qk2.N(editorInfo, zseVar.a.b);
            editorInfo.imeOptions |= 33554432;
            if (jt4.d()) {
                jt4.a().i(editorInfo);
            }
            dkb dkbVar = new dkb(legacyTextInputServiceAndroid.g, new oid(i5, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(dkbVar));
            return dkbVar;
        }
        editorInfo.inputType = 1;
        i6 = 1;
        if (!z) {
            i6 |= 131072;
            editorInfo.inputType = i6;
            if (i4 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i6 & 15) == 1) {
            i2 = rx6Var.b;
            if (i2 == 1) {
                i6 |= 4096;
                editorInfo.inputType = i6;
            } else if (i2 == 2) {
                i6 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                editorInfo.inputType = i6;
            } else if (i2 == 3) {
                i6 |= 16384;
                editorInfo.inputType = i6;
            }
            if (rx6Var.c) {
                editorInfo.inputType = 32768 | i6;
            }
        }
        long j2 = zseVar.b;
        int i10 = eue.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        qk2.N(editorInfo, zseVar.a.b);
        editorInfo.imeOptions |= 33554432;
        if (jt4.d()) {
            jt4.a().i(editorInfo);
        }
        dkb dkbVar2 = new dkb(legacyTextInputServiceAndroid.g, new oid(i5, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(dkbVar2));
        return dkbVar2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        zq zqVar = this.contentCaptureManager;
        zqVar.getClass();
        xq.v(zqVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.z;
        if (l() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            i79 i79Var = a2;
            synchronized (i79Var) {
                i79Var.l(this);
            }
        }
        getComposeViewContext().b();
        nsd nsdVar = getSnapshotObserver().a;
        hrd hrdVar = nsdVar.h;
        if (hrdVar != null) {
            hrdVar.a();
        }
        nsdVar.a();
        h48 h48VarK = getComposeViewContext().d().k();
        h48VarK.b(this.contentCaptureManager);
        h48VarK.b(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        e58 e58Var = this.f;
        if (e58Var != null) {
            e58Var.c = false;
        }
        this.f = null;
        if (i >= 31) {
            qq.a.a(this);
        }
        zo autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.l(autofillManager);
            ((bo5) getFocusOwner()).g.l(autofillManager);
        }
        jkb rectManager = getRectManager();
        rectManager.g = rectManager.d.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        jkb rectManager2 = getRectManager();
        wp wpVar = rectManager2.i;
        if (wpVar != null) {
            rectManager2.b.removeCallbacks(wpVar);
            rectManager2.i = null;
        }
        ((bo5) getFocusOwner()).g.l(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        bo5 bo5Var = (bo5) getFocusOwner();
        t72.R(bo5Var.c, true);
        if (bo5Var.g() != null) {
            oo5 oo5VarG = bo5Var.g();
            bo5Var.j(null);
            if (oo5VarG != null) {
                oo5VarG.m1(ko5.a, ko5.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.i1.n(this.P1);
            this.g1 = null;
            L();
            if (this.f1 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ld5 ld5Var = this.i1;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().W()) {
                getRoot().e(this);
            }
            if (!isAttachedToWindow()) {
                k(getRoot());
            }
            long jD = d(i);
            long jD2 = d(i2);
            long jR = pa7.R((int) (jD >>> 32), (int) (jD & 4294967295L), (int) (jD2 >>> 32), (int) (4294967295L & jD2));
            kl2 kl2Var = this.g1;
            if (kl2Var == null) {
                this.g1 = new kl2(jR);
                this.h1 = false;
            } else if (!kl2.b(kl2Var.a, jR)) {
                this.h1 = true;
            }
            ld5Var.z(jR);
            ld5Var.p();
            setMeasuredDimension(getRoot().I(), getRoot().r());
            if (this.f1 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().I(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().r(), 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.T1) {
            return;
        }
        z(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        mia miaVar;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (miaVar = ((dq) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return miaVar instanceof ju ? PointerIcon.getSystemIcon(context, ((ju) miaVar).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(x48 x48Var) {
        rl1 rl1VarV;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(ynb.K());
        }
        e58 e58Var = this.f;
        if (e58Var != null) {
            d58 d58Var = this.frameEndScheduler;
            d58Var.getClass();
            zk8 zk8Var = (zk8) e58Var.a.b;
            if (!zk8Var.a || zk8Var.c) {
                return;
            }
            try {
                rl1VarV = ((pcg) d58Var).a.v(new zv6(12, e58Var));
            } catch (CancellationException unused) {
                if (!zk8Var.b) {
                    if (zk8Var.c) {
                        fpa.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zk8Var.a();
                    zk8Var.c = true;
                }
                rl1VarV = null;
            }
            rl1 rl1Var = e58Var.d;
            if (rl1Var != null) {
                rl1Var.cancel();
            }
            e58Var.d = rl1VarV;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        cv7 cv7Var;
        if (this.c) {
            int[] iArr = un5.a;
            cv7 cv7Var2 = cv7.a;
            if (i != 0) {
                cv7Var = i != 1 ? null : cv7.b;
            } else {
                cv7Var = cv7Var2;
            }
            if (cv7Var != null) {
                cv7Var2 = cv7Var;
            }
            setLayoutDirection(cv7Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        qm2 qm2Var;
        if (Build.VERSION.SDK_INT < 31 || (qm2Var = this.U1) == null) {
            return;
        }
        qm2Var.g(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(x48 x48Var) {
        e58 e58Var = this.f;
        if (e58Var != null) {
            zk8 zk8Var = (zk8) e58Var.a.b;
            if (zk8Var.a && !zk8Var.c) {
                rl1 rl1Var = e58Var.d;
                if (rl1Var != null) {
                    rl1Var.cancel();
                }
                e58Var.d = null;
                return;
            }
            if (zk8Var.b) {
                return;
            }
            if (!zk8Var.c) {
                fpa.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((w79) zk8Var.d).i()) {
                fpa.a("Attempted to start retaining exited values with pending exited values");
            }
            zk8Var.c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new m47(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        zq zqVar = this.contentCaptureManager;
        zqVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (pa7.t(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            xq.e(zqVar, longSparseArray);
        } else {
            zqVar.a.post(new fe(3, zqVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zK;
        this.R1 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zK = ynb.K())) {
            return;
        }
        setShowLayoutBounds(zK);
        j(getRoot());
    }

    public final void p(float[] fArr) {
        A();
        zm8.e(fArr, this.n1);
        tq.K(fArr, Float.intBitsToFloat((int) (this.r1 >> 32)), Float.intBitsToFloat((int) (this.r1 & 4294967295L)), this.l1);
    }

    public final long q(long j) {
        A();
        long jB = zm8.b(j, this.n1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.r1 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.r1 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void r(boolean z) {
        ld5 ld5Var = this.i1;
        if (((ta0) ld5Var.e).J() || ((p89) ((fz3) ld5Var.f).b).c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (ld5Var.n(z ? this.P1 : this.Q1)) {
                    requestLayout();
                }
                ld5Var.d(false);
                getRectManager().a();
                if (this.V0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.V0 = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            mn5 mn5VarD = un5.d(i);
            int i3 = mn5VarD != null ? mn5VarD.a : 7;
            Boolean boolF = ((bo5) getFocusOwner()).f(i3, rect != null ? ynb.l0(rect) : null, new xp(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!pa7.t(boolF, bool)) {
                if (!pa7.t(((bo5) getFocusOwner()).f(i3, null, new xp(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((bo5) getFocusOwner()).i(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(LayoutNode layoutNode, long j) {
        ld5 ld5Var = this.i1;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ld5Var.o(layoutNode, j);
            if (!((ta0) ld5Var.e).J()) {
                ld5Var.d(false);
                getRectManager().a();
                this.Q1.invoke();
                if (this.V0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.V0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.O0.v = intervalMillis;
    }

    public final void setComposeViewContext(qf2 qf2Var) {
        if (getCoroutineContext() != qf2Var.c().k() && !getRoot().getChildren$ui().isEmpty()) {
            i37.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            qf2 qf2Var2 = get_composeViewContext();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            if (qf2Var != qf2Var2) {
                if (isAttachedToWindow()) {
                    qf2Var2.b();
                    qf2Var.e();
                }
                set_composeViewContext(qf2Var);
                setCoroutineContext(qf2Var.c().k());
            }
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.Y0.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(zq zqVar) {
        this.contentCaptureManager = zqVar;
    }

    public void setCoroutineContext(pv2 pv2Var) {
        this.coroutineContext = pv2Var;
    }

    public final void setFrameEndScheduler$ui(d58 d58Var) {
        this.frameEndScheduler = d58Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(a26 callback) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            callback.d(getComposeViewContext());
        } else {
            this.s1 = callback;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(l26 l26Var) {
        this.playNavigationSoundEffect = l26Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(y17 y17Var) {
        this.primaryDirectionalMotionAxisOverride = y17Var;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(j6c handler) {
        this.i1.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(int i) {
        if (i != 7 && i != 8) {
            Integer numC = un5.c(i);
            if (numC == null) {
                throw kv2.d("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            oo5 oo5VarG = ((bo5) getFocusOwner()).g();
            if (oo5VarG == null) {
                qc0.p("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = un5.c(i);
            if (numC2 == null) {
                throw kv2.d("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            uvf uvfVar = vd0.s0(oo5VarG).E0;
            View interopView = uvfVar != null ? uvfVar.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !tq.q(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return un5.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void u() {
        i79 i79Var;
        Object[] objArr;
        if (this.c1) {
            nsd nsdVar = getSnapshotObserver().a;
            xn9 xn9Var = new xn9(24);
            synchronized (nsdVar.g) {
                try {
                    p89 p89Var = nsdVar.f;
                    int i = p89Var.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = p89Var.a;
                        if (i2 >= i) {
                            break;
                        }
                        msd msdVar = (msd) objArr[i2];
                        msdVar.d(xn9Var);
                        if (!msdVar.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = p89Var.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    p89Var.c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.c1 = false;
        }
        ex exVar = this.f1;
        if (exVar != null) {
            c(exVar);
        }
        zo autofillManager = getAutofillManager();
        if (autofillManager != null) {
            r69 r69Var = autofillManager.v;
            if (r69Var.d == 0 && autofillManager.w) {
                autofillManager.a.w().commit();
                autofillManager.w = false;
            }
            if (r69Var.d != 0) {
                autofillManager.w = true;
            }
        }
        while (this.F1.e() && this.F1.b(0) != null) {
            int i5 = this.F1.b;
            int i6 = 0;
            while (true) {
                i79Var = this.F1;
                if (i6 < i5) {
                    x16 x16Var = (x16) i79Var.b(i6);
                    this.F1.p(i6, null);
                    if (x16Var != null) {
                        x16Var.invoke();
                    }
                    i6++;
                }
            }
            i79Var.n(0, i5);
        }
    }

    public final void v(LayoutNode layoutNode) {
        lq lqVar = this.O0;
        lqVar.M0 = true;
        if (lqVar.v()) {
            lqVar.w(layoutNode);
        }
        zq zqVar = this.contentCaptureManager;
        zqVar.f = true;
        if (zqVar.d()) {
            zqVar.g.d(wef.a);
        }
    }

    public final void w(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode layoutNodeF;
        LayoutNode layoutNodeF2;
        ld5 ld5Var = this.i1;
        if (!z) {
            if (ld5Var.x(layoutNode, z2) && z3) {
                F(layoutNode);
                return;
            }
            return;
        }
        ta0 ta0Var = (ta0) ld5Var.e;
        if (layoutNode.w == null) {
            i37.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = layoutNode.u().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    ap.c();
                    return;
                }
                if (!layoutNode.x() || z2) {
                    layoutNode.f0();
                    layoutNode.g0();
                    if (layoutNode.f1) {
                        return;
                    }
                    if ((pa7.t(layoutNode.Z(), Boolean.TRUE) || ld5.k(layoutNode)) && ((layoutNodeF = layoutNode.F()) == null || !layoutNodeF.x())) {
                        ta0Var.b(layoutNode, cb7.a);
                    } else if ((layoutNode.X() || ld5.l(layoutNode)) && ((layoutNodeF2 = layoutNode.F()) == null || !layoutNodeF2.A())) {
                        ta0Var.b(layoutNode, cb7.c);
                    }
                    if (ld5Var.c || !z3) {
                        return;
                    }
                    F(layoutNode);
                    return;
                }
                return;
            }
        }
        ((p89) ld5Var.h).b(new un8(layoutNode, true, z2));
    }

    public final void x(LayoutNode layoutNode, boolean z, boolean z2) {
        cb7 cb7Var = cb7.d;
        ld5 ld5Var = this.i1;
        if (!z) {
            ld5Var.getClass();
            int iOrdinal = layoutNode.u().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                ap.c();
                return;
            }
            LayoutNode layoutNodeF = layoutNode.F();
            boolean z3 = layoutNodeF == null || layoutNodeF.X();
            if (!z2) {
                if (layoutNode.A()) {
                    return;
                }
                if (layoutNode.t() && layoutNode.X() == z3 && layoutNode.X() == layoutNode.Y()) {
                    return;
                }
            }
            layoutNode.d0();
            if (!layoutNode.f1 && layoutNode.Y() && z3) {
                if ((layoutNodeF == null || !layoutNodeF.t()) && (layoutNodeF == null || !layoutNodeF.A())) {
                    ((ta0) ld5Var.e).b(layoutNode, cb7Var);
                }
                if (ld5Var.c) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        ta0 ta0Var = (ta0) ld5Var.e;
        int iOrdinal2 = layoutNode.u().ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    ap.c();
                    return;
                }
            }
        }
        if ((layoutNode.x() || layoutNode.v()) && !z2) {
            return;
        }
        layoutNode.e0();
        layoutNode.d0();
        if (layoutNode.f1) {
            return;
        }
        LayoutNode layoutNodeF2 = layoutNode.F();
        if (pa7.t(layoutNode.Z(), Boolean.TRUE) && ((layoutNodeF2 == null || !layoutNodeF2.x()) && (layoutNodeF2 == null || !layoutNodeF2.v()))) {
            ta0Var.b(layoutNode, cb7.b);
        } else if (layoutNode.X() && ((layoutNodeF2 == null || !layoutNodeF2.t()) && (layoutNodeF2 == null || !layoutNodeF2.A()))) {
            ta0Var.b(layoutNode, cb7Var);
        }
        if (ld5Var.c) {
            return;
        }
        F(null);
    }

    public final void y() {
        lq lqVar = this.O0;
        lqVar.M0 = true;
        Handler handler = lqVar.d.getHandler();
        if (lqVar.v() && !lqVar.X0 && handler != null) {
            lqVar.X0 = true;
            handler.post(lqVar.Z0);
        }
        zq zqVar = this.contentCaptureManager;
        zqVar.f = true;
        Handler handler2 = zqVar.a.getHandler();
        if (!zqVar.d() || zqVar.z || handler2 == null) {
            return;
        }
        zqVar.z = true;
        handler2.post(zqVar.X);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    public final void z(ViewStructure viewStructure) {
        zo autofillManager = getAutofillManager();
        if (autofillManager != null) {
            LayoutNode layoutNode = autofillManager.b.a;
            AutofillId autofillId = autofillManager.g;
            String str = autofillManager.e;
            jkb jkbVar = autofillManager.d;
            qn4.N(viewStructure, layoutNode, autofillId, str, jkbVar);
            Object[] objArr = rk9.a;
            i79 i79Var = new i79(2);
            i79Var.h(layoutNode);
            i79Var.h(viewStructure);
            while (i79Var.e()) {
                Object objM = i79Var.m(i79Var.b - 1);
                objM.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objM;
                Object objM2 = i79Var.m(i79Var.b - 1);
                objM2.getClass();
                List<LayoutNode> childrenInfo = ((LayoutNode) objM2).getChildrenInfo();
                int size = childrenInfo.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode2 = childrenInfo.get(i);
                    if (!layoutNode2.f1 && layoutNode2.W() && layoutNode2.X()) {
                        twc twcVarH = layoutNode2.H();
                        if (twcVarH != null) {
                            w79 w79Var = twcVarH.a;
                            if (w79Var.b(swc.g) || w79Var.b(swc.h) || w79Var.b(cxc.r) || w79Var.b(cxc.s) || (Build.VERSION.SDK_INT >= 34 && w79Var.b(oa7.h))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                qn4.N(viewStructureNewChild, layoutNode2, autofillId, str, jkbVar);
                                i79Var.h(layoutNode2);
                                i79Var.h(viewStructureNewChild);
                            } else {
                                i79Var.h(layoutNode2);
                                i79Var.h(viewStructure2);
                            }
                        } else {
                            i79Var.h(layoutNode2);
                            i79Var.h(viewStructure2);
                        }
                    }
                }
            }
        }
        yo autofill = getAutofill();
        if (autofill != null) {
            wq0 wq0Var = autofill.b;
            LinkedHashMap linkedHashMap = wq0Var.a;
            LinkedHashMap linkedHashMap2 = wq0Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    r3.f();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.a.getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public yo getAutofill() {
        return this.autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public zo getAutofillManager() {
        return this.autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public pr getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: from getter and merged with bridge method [inline-methods] */
    public q69 m3getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @dx3
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @dx3
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public k6c getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(j6c j6cVar) {
    }
}
