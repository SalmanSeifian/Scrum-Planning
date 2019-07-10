package com.scrumplanning.ui.participants

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.scrumplanning.R
import kotlinx.android.synthetic.main.item_participant.view.*

class ParticipantsAdapter :
    RecyclerView.Adapter<ParticipantsAdapter.ParticipantViewHolder>() {

    var participants = listOf<Participant>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipantViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_participant, parent, false)
        return ParticipantViewHolder(v)
    }

    override fun getItemCount(): Int {
        return participants.size
    }

    override fun onBindViewHolder(holder: ParticipantViewHolder, position: Int) = holder.bind(participants[position])


    inner class ParticipantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(participant: Participant) {

            with(itemView) {
                txtParticipantName.text = participant.name
            }

        }
    }

}
