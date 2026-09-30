package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class saf extends qt0 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket v;
    public MulticastSocket w;
    public InetAddress x;
    public boolean y;
    public int z;

    public saf() {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws raf {
        DatagramSocket datagramSocket;
        Uri uri = dc3Var.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        p();
        try {
            this.x = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.x, port);
            if (this.x.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.w = multicastSocket;
                multicastSocket.joinGroup(this.x);
                datagramSocket = this.w;
                this.v = datagramSocket;
            } else {
                DatagramSocket datagramSocket2 = new DatagramSocket(inetSocketAddress);
                this.v = datagramSocket2;
                datagramSocket = datagramSocket2;
            }
            datagramSocket.setSoTimeout(8000);
            this.y = true;
            q(dc3Var);
            return -1L;
        } catch (IOException e) {
            throw new raf(2001, e);
        } catch (SecurityException e2) {
            throw new raf(2006, e2);
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        this.g = null;
        MulticastSocket multicastSocket = this.w;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.x;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.w = null;
        }
        DatagramSocket datagramSocket = this.v;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.v = null;
        }
        this.x = null;
        this.z = 0;
        if (this.y) {
            this.y = false;
            n();
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.g;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws raf {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.z;
        DatagramPacket datagramPacket = this.f;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.v;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.z = length;
                j(length);
            } catch (SocketTimeoutException e) {
                throw new raf(2002, e);
            } catch (IOException e2) {
                throw new raf(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.z;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.e, length2 - i4, bArr, i, iMin);
        this.z -= iMin;
        return iMin;
    }
}
