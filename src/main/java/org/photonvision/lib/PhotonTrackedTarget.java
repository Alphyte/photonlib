/**
 * Copyright (C) 2020 Photon Vision.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.photonvision.lib;

import edu.wpi.first.wpilibj.geometry.Pose2d;

import java.util.List;

public class PhotonTrackedTarget {
  final double pitch, yaw, skew, area;
  final Pose2d robotRelativePose;
  final List<Double> rawTvec, rawRvec;

  public PhotonTrackedTarget(double pitch, double yaw, double skew, double area, Pose2d robotRelativePose, List<Double> rawTvec, List<Double> rawRvec) {
    this.pitch = pitch;
    this.yaw = yaw;
    this.skew = skew;
    this.area = area;
    this.robotRelativePose = robotRelativePose;
    this.rawTvec = rawTvec;
    this.rawRvec = rawRvec;
  }
}
